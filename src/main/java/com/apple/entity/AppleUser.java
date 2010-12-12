package com.apple.entity;

import java.io.Serializable;

public class AppleUser implements Serializable {

	private String appleid;
	private String password;
	public String getAppleid() {
		return appleid;
	}
	public void setAppleid(String appleid) {
		this.appleid = appleid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
