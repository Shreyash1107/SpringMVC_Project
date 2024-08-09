package org.alumni.repository;
import java.util.*;
import org.alumni.model.LoginModel;

public interface Loginrepository 
{
	public boolean isStudentregister(LoginModel lm);
	public Vector<LoginModel> getlogin(String username, String Password);
}
