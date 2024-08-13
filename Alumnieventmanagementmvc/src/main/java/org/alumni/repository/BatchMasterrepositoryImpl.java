package org.alumni.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import org.alumni.model.BatchMasterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("batchRepo")
public class BatchMasterrepositoryImpl implements BatchMasterrepository {
	@Autowired
	JdbcTemplate template;

	public boolean isBatchadded(BatchMasterModel bm) {
		int val;
		PreparedStatementSetter pstmt = new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bm.getbatchyear());
			}
		};
		val = template.update("insert into batchmaster values('0',?)", pstmt);
		return val > 0 ? true : false;
	}

	public Vector<BatchMasterModel> getbatches() {

		/*
		 * List<BatchMasterModel> vObjects = template.query("select *from BatchMaster",
		 * new RowMapper<BatchMasterModel>() {
		 * 
		 * @Override public BatchMasterModel mapRow(ResultSet rs, int rowNum) throws
		 * SQLException { // TODO Auto-generated method stub BatchMasterModel bmodel =
		 * new BatchMasterModel(); bmodel.setbid(rs.getInt(1));
		 * bmodel.setyear(rs.getString(2)); System.out.println(bmodel.getbid() + " " +
		 * bmodel.getbatchyear()); return bmodel; } });
		 */
		/* System.out.println("Objects :"+vObjects); */
		RowMapper<BatchMasterModel> rmap = new  RowMapper<BatchMasterModel>() {
			@Override
			public BatchMasterModel mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				BatchMasterModel bmodel = new BatchMasterModel();
				bmodel.setbid(rs.getInt(1));
				bmodel.setyear(rs.getString(2));
				/* System.out.println(bmodel.getbid() + " " + bmodel.getbatchyear()); */
				return bmodel;
			}
		};
		List<BatchMasterModel> list = template.query("select *from BatchMaster",rmap);
		Vector<BatchMasterModel> btch = new Vector<BatchMasterModel>(list);
		return btch.size()>0?btch:null;
	}
}