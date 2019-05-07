package org.regnant.bean;

public class ProfileBean {
	private String username;
	private String email;
	private String phone;

	public ProfileBean(String username, String email, String phone) {
		this.username = username;
		this.email = email;
		this.phone = phone;
	}

	public ProfileBean() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
