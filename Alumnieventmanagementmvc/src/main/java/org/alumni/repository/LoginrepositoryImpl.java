package org.alumni.repository;
import org.springframework.jdbc.core.RowMapper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import org.alumni.model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
@Repository("loginrepo")
public class LoginrepositoryImpl implements Loginrepository
{
	@Autowired
	JdbcTemplate template;
	public boolean isStudentregister(LoginModel lm)
	{
		PreparedStatementSetter pstmt = new PreparedStatementSetter() 
		{	
			@Override
			public void setValues(PreparedStatement ps) throws SQLException 
			{
				ps.setString(1, lm.getusername());
				ps.setString(2, lm.getpassword());
				ps.setString(3, lm.getemail());
				ps.setString(4, lm.getcontact());
			}
		};
		int val = template.update("insert into login values('0',?,?,?,?)", pstmt);
		return val>0?true:false;
	}
	public Vector<LoginModel> getlogin(String username, String password)
	{
		PreparedStatementSetter pstmt = new PreparedStatementSetter() 
		{
			@Override
			public void setValues(PreparedStatement ps) throws SQLException 
			{
					ps.setString(1, username);
					ps.setString(2, password);
			}
		};
		RowMapper<LoginModel> rmap = new RowMapper<LoginModel>() 
		{	
			@Override
			public LoginModel mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				LoginModel lmodel = new LoginModel();
				lmodel.setuid(rs.getInt("userid"));
				lmodel.setusername(rs.getString("username"));
				lmodel.setpassword(rs.getString("Password"));
				lmodel.setemail(rs.getString("Email"));
				lmodel.setcontact(rs.getString("Contact"));
				return lmodel;
			}
		};
		List<LoginModel> list = template.query("select *from Login where username = ? and password = ?", pstmt,rmap);
		Vector<LoginModel> vect = new Vector<LoginModel>(list);
		return vect.size()>0?vect:null;
	}
}