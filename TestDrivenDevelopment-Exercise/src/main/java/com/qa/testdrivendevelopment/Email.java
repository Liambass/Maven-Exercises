package com.qa.testdrivendevelopment;

public class Email {
	
	
	public boolean isValidEmail(String email) {
		return email.matches("[A-Za-z0-9][\\w.]*@[A-Za-z0-9][\\w.]*[A-Za-z0-9][.][A-Za-z]{1,3}$");
	}

}
