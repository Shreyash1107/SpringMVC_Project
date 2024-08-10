package org.alumni.model;

public class BatchMasterModel 
{
	private int bid;
	private String batch_year;
	public void setbid(int bid)
	{
		this.bid = bid;
	}
	public int getbid()
	{
		return bid;
	}
	public void setyear(String batch_year)
	{
		this.batch_year = batch_year;
	}
	public String getbatchyear()
	{
		return batch_year;
	}
}
