package com.example.jpaaa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String uname;
	private String phn_no;
	@Lob
	private byte[] uimage;
	private String address;
	private String emailId;
	private String fname;
	private String lname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getuname() {
		return uname;
	}

	public void setuname(String uname) {
		this.uname = uname;
	}

	public String getphn_no() {
		return phn_no;
	}

	public void setphn_no(String phn_no) {
		this.phn_no = phn_no;
	}

	public byte[] getuimage() {
		return uimage;
	}

	public void setuimage(byte[] uimage) {
		this.uimage = uimage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getfname() {
		return fname;
	}

	public void setfname(String fname) {
		this.fname = fname;
	}

	public String getlname() {
		return lname;
	}

	public void setlname(String lname) {
		this.lname = lname;
	}

}