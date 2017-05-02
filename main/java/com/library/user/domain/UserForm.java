package com.library.user.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


public class UserForm {

	private int id ; // Primary Key
	private String fname ;
	private String lname;
	private String admin;
    private String type ;
    private String address_1;
    private String address_2;
    private String zip;
    
    public UserForm() {
    	
    }
    
    public UserForm(int id, String fname, String lname, String admin, String type, String address_1, String address_2,
			String zip) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.admin = admin;
		this.type = type;
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.zip = zip;
	}
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
    
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
    
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
    
	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
    
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
    
    

}
