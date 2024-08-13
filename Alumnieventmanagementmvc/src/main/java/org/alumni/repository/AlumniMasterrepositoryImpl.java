package org.alumni.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import org.alumni.model.Alumnimastermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("amrepo")
public class AlumniMasterrepositoryImpl implements AlumniMasterrepository {
	@Autowired
	JdbcTemplate template;

	public boolean isAlumniadded(Alumnimastermodel amodel) {
		int val;
		PreparedStatementSetter pstmt = new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, amodel.getname());
				ps.setString(2, amodel.getemail());
				ps.setString(3, amodel.getcontact());
				ps.setInt(4, amodel.getage());
				ps.setString(5, amodel.getCompany());
				ps.setInt(6, amodel.getBid());
			}
		};
		val = template.update("insert into Alumnimaster values('0',?,?,?,?,?,?)", pstmt);
		return val > 0 ? true : false;
	}

	public Vector<Alumnimastermodel> viewalumni() {
		RowMapper<Alumnimastermodel> rmap = new RowMapper<Alumnimastermodel>() {
			@Override
			public Alumnimastermodel mapRow(ResultSet rs, int rowNum) throws SQLException {
				Alumnimastermodel amd = new Alumnimastermodel();
				amd.setaid(rs.getInt(1));
				amd.setname(rs.getString(2));
				amd.setemail(rs.getString(3));
				amd.setcontact(rs.getString(4));
				amd.setage(rs.getInt(5));
				amd.setcompany(rs.getString(6));
				amd.setbid(rs.getInt(7));
				return amd;
			}
		};
		List<Alumnimastermodel> alumni = template.query("select *from Alumnimaster", rmap);
		Vector<Alumnimastermodel> vect = new Vector<Alumnimastermodel>(alumni);
		return vect.size() > 0 ? vect : null;
	}

	public void deletealumnibyid(int aid) {
		template.update("delete from Alumnimaster where aid = " + aid);
	}
	/*
	 * public void updatealumnibyid(int aid) { template.update("update ") }
	 */
}
