package org.alumni.repository;

import java.util.Vector;

import org.alumni.model.Alumnimastermodel;

public interface AlumniMasterrepository 
{
	public boolean isAlumniadded(Alumnimastermodel amodel);
	public Vector<Alumnimastermodel> viewalumni();
	public void deletealumnibyid(int aid);
	public void updatealumnibyid(int aid);
}
