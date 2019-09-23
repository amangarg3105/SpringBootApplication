package mainpackage.model;

import java.util.ArrayList;
import java.util.List;


public class User {


	private Integer id;

	private String username;

	private String password;
	
	private String fullName;
	
	private String emailAddress;
	
	private Integer mobileNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public Integer getMobileNumber() {
		return mobileNumber;
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
	
	public String setFullName() {
		return fullName;
	}
	
	public String setEmailAddress() {
		return emailAddress;
	}
	
	public Integer setMobileNumber() {
		return mobileNumber;
	}
}
