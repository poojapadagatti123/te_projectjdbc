package com.techno.usermanagement.bean;

import java.io.Serializable;

public class User implements Serializable{
	int id;
    String name;
    String country;
    String email;
    
    public User() {
	}
	
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}
    public User(int id, String name, String country, String email) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
