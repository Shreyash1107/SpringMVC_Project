package org.alumni.service;

import java.util.Vector;

import org.alumni.model.BatchMasterModel;

public interface BatchMasterService 
{
	public boolean isBatchadded(BatchMasterModel bm);
	public Vector<BatchMasterModel> getbatches();
}
