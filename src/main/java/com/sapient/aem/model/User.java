package com.sapient.aem.model;

public class User {
	private int userid;
	private String firstname;
	private String lastname;
	private String occupation;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public User(int userid, String firstname, String lastname, String occupation) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.occupation = occupation;
	}
	
}
