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

@Entity
@Table(name = "user")
public class User {

	private int id ; // Primary Key
	private String fname ;
	private String lname;
	private boolean admin;
    private UserType type ;
    private String address_1;
    private String address_2;
    private String zip;
    
    public User() {
    	
    }
    
    public User(int id, String fname, String lname, boolean admin, UserType type, String address_1, String address_2,
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
    
    @Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userid", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	@Column(name = "user_fname")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
    
	@Column(name = "user_lname")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
    
	@Column(name = "user_admin")
	@Type(type="yes_no")
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
    
	@Enumerated(EnumType.STRING)
	@Column(name = "user_type")
	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
    
	@Column(name = "user_address1")
	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
    
	@Column(name = "user_address2")
	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
    
	@Column(name = "user_zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
    
    

}
