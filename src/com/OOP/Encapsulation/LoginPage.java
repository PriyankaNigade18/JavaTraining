package com.OOP.Encapsulation;

public class LoginPage 
{
	private String username;
	private String password;
	
	//methods
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//business logic
	public void doLogin(String username,String password)
	{
		System.out.println("You logged In as: "+username);
	}
	

}
