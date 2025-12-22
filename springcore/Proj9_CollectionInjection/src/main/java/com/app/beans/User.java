package com.app.beans;

import java.util.Set;

public class User {
	
	private Set<Long> phone;
	private Set<String> email;
	
	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [phone=" + phone + ", email=" + email + "]";
	}
}
