package org.alumni.service;

import java.util.Vector;

import org.alumni.model.Alumnimastermodel;

public interface Alumnimasterservice 
{
	public boolean isAlumniadded(Alumnimastermodel amodel);
	public Vector<Alumnimastermodel> viewalumni();
	public void deletealumnibyid(int aid);
}
