package org.alumni.service;

import org.alumni.model.BatchMasterModel;
import org.alumni.repository.BatchMasterrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value = "batchservice")
public class BatchMasterServiceImpl implements BatchMasterService
{
	@Autowired
	BatchMasterrepository batchrepo;
	public boolean isBatchadded(BatchMasterModel bm)
	{
		return batchrepo.isBatchadded(bm);
	}
}
