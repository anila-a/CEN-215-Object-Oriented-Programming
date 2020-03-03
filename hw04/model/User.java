package model;

import java.io.Serializable;

public abstract class User implements Serializable {
	private String userID;
	private String PIN;
	private String name;
	private String surname;
	
	public User(String userID, String PIN, String name, String surname) {
		this.userID = userID;
		this.PIN = PIN;
		this.name = name;
		this.surname = surname;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String PIN) {
		this.PIN = PIN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
