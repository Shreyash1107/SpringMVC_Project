package org.alumni.service;

import java.util.Vector;

import org.alumni.model.LoginModel;

public interface Loginservice 
{
	public boolean isStudentregister(LoginModel lm);
	public Vector<LoginModel> getlogin(String username, String password);
}
