package org.alumni.service;

import java.util.Vector;

import org.alumni.model.Alumnimastermodel;
import org.alumni.repository.AlumniMasterrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("amservice")
public class AlumnimasterserviceImpl implements Alumnimasterservice
{
	@Autowired
	AlumniMasterrepository amrepo;
	public boolean isAlumniadded(Alumnimastermodel amodel)
	{
		return amrepo.isAlumniadded(amodel);
	}
	public Vector<Alumnimastermodel> viewalumni()
	{
		return amrepo.viewalumni();
	}
	public void deletealumnibyid(int aid)
	{
		amrepo.deletealumnibyid(aid);
	}
}
