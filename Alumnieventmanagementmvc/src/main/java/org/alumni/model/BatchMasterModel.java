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
	@Override
	public String toString() {
		return "BatchMasterModel [bid=" + bid + ", batch_year=" + batch_year + "]";
	}
	public BatchMasterModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
