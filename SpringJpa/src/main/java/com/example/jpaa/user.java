package com.example.jpaa;

public class user {
private String Fname;
private String Lname;
private String id;
private String username;
private String phn_no;
private String address;
private String emailId;
private byte UserImage;
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getid() {
	return id;
}
public void setUserId(String userId) {
	id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPhn_no() {
	return phn_no;
}
public void setPhn_no(String phn_no) {
	this.phn_no = phn_no;
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
public byte getUserImage() {
	return UserImage;
}
public void setUserImage(byte userImage) {
	UserImage = userImage;
}

}
