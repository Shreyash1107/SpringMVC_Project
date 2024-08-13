package org.alumni.repository;

import java.util.Vector;

import org.alumni.model.BatchMasterModel;

public interface BatchMasterrepository 
{
	public boolean isBatchadded(BatchMasterModel bm);
	public Vector<BatchMasterModel> getbatches();
}
