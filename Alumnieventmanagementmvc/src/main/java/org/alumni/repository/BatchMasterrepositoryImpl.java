package org.alumni.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.alumni.model.BatchMasterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
@Repository(value = "batchrepo")
public class BatchMasterrepositoryImpl implements BatchMasterrepository
{
	@Autowired
	JdbcTemplate template;
	public boolean isBatchadded(BatchMasterModel bm)
	{
		int val;
		PreparedStatementSetter pstmt = new PreparedStatementSetter() 
		{
			@Override
			public void setValues(PreparedStatement ps) throws SQLException 
			{
				ps.setString(1, bm.getbatchyear());
			}
		};
		val = template.update("insert into batchmaster values('0',?)", pstmt);
		return val>0?true:false;
	}
}
