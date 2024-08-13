package org.alumni.service;

import java.util.ArrayList;
import java.util.Vector;

import org.alumni.model.BatchMasterModel;
import org.alumni.repository.BatchMasterrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service( "batchservice")
public class BatchMasterServiceImpl implements BatchMasterService {

	@Autowired
	BatchMasterrepository batchRepo;

	public boolean isBatchadded(BatchMasterModel bm) {
		return batchRepo.isBatchadded(bm);
	}

	public Vector<BatchMasterModel> getbatches() {
		/* Vector al=batchrepo.getbatches(); System.out.println(al); */
		if (batchRepo != null) 
		{
			System.out.println("Yes");
		} 
		else 
		{
			System.out.println("No");
		}
		return batchRepo.getbatches();
	}
}
