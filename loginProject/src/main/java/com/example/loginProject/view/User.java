package com.example.loginProject.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named @RequestScoped
public class User {
	private String user_name;
	private String password;
	
	public User() {
	
	}

	

	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("User Name: "+this.user_name +",  Password: "+this.password);
	}
	
	
	
	

}
