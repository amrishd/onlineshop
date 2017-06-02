package com.onlineshop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class UserModel {
@Id
@GeneratedValue
private int user_id;
@Column(name="name")
private String user_name;
@Column(name="lastname")
private String user_lastname;
@Column(name="username",unique=true)
private String username; 
@Column(name="emailid")
private String user_emailid;
@Transient
@Column(name="password")
private String user_password;
@Transient
private String user_confirmpassword;
@Column(name="contact_no")
private String user_contactno;
@Column(name="address")
private String user_address;
@Column(name="city")
private String user_city;
@Column(name="pincode")
private String user_pincode;
@Column(name="gender")
private String user_gender;
@Column(name="Date_of_birth")
private String user_dob;
public void UserModel()
{
	
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_lastname() {
	return user_lastname;
}
public void setUser_lastname(String user_lastname) {
	this.user_lastname = user_lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUser_emailid() {
	return user_emailid;
}
public void setUser_emailid(String user_emailid) {
	this.user_emailid = user_emailid;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public String getUser_confirmpassword() {
	return user_confirmpassword;
}
public void setUser_confirmpassword(String user_confirmpassword) {
	this.user_confirmpassword = user_confirmpassword;
}
public String getUser_contactno() {
	return user_contactno;
}
public void setUser_contactno(String user_contactno) {
	this.user_contactno = user_contactno;
}
public String getUser_address() {
	return user_address;
}
public void setUser_address(String user_address) {
	this.user_address = user_address;
}
public String getUser_city() {
	return user_city;
}
public void setUser_city(String user_city) {
	this.user_city = user_city;
}
public String getUser_pincode() {
	return user_pincode;
}
public void setUser_pincode(String user_pincode) {
	this.user_pincode = user_pincode;
}
public String getUser_gender() {
	return user_gender;
}
public void setUser_gender(String user_gender) {
	this.user_gender = user_gender;
}
public String getUser_dob() {
	return user_dob;
}
public void setUser_dob(String user_dob) {
	this.user_dob = user_dob;
}
}
