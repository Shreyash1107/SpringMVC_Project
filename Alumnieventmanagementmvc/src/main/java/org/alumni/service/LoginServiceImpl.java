package org.alumni.service;

import java.util.Vector;

import org.alumni.model.LoginModel;
import org.alumni.repository.Loginrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("loginservice")
public class LoginServiceImpl implements Loginservice
{
	@Autowired
	Loginrepository loginrepo;
	public boolean isStudentregister(LoginModel lm)
	{
		return loginrepo.isStudentregister(lm);
	}
	public Vector<LoginModel> getlogin(String username, String password)
	{
		return loginrepo.getlogin(username, password);
	}
}
