package org.alumni.model;

import org.springframework.stereotype.Component;

public class LoginModel 
{
	private int uid;
	private String username;
	private String password;
	private String Email;
	private String Contact;
	public void setuid(int uid)
	{
		this.uid = uid;
	}
	public int getuid()
	{
		return uid;
	}
	public void setusername(String username)
	{
		this.username = username;
	}
	public String getusername()
	{
		return username;
	}
	public void setpassword(String password)
	{
		this.password = password;
	}
	public String getpassword()
	{
		return password;
	}
	public void setemail(String Email)
	{
		this.Email = Email;
	}
	public String getemail()
	{
		return Email;
	}
	public void setcontact(String Contact)
	{
		this.Contact = Contact;
	}
	public String getcontact()
	{
		return Contact;
	}
}