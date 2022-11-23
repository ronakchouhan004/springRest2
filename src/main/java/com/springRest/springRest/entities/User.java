package com.springRest.springRest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Long account_no;
	
	
	private String name;
	private String email;
	private String address;
	
	private long mobile;
	private String password;
	
	public User(String name, String email, String address, long account_no, long mobile, String password) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.account_no = account_no;
		this.mobile = mobile;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", address=" + address + ", account_no=" + account_no
				+ ", mobile=" + mobile + ", password=" + password + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getAccount_no()=" + getAccount_no()
				+ ", getMobile()=" + getMobile() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
