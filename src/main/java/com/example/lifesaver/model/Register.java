package com.example.lifesaver.model;

public class Register {
private String name;
private String email;
private String contact;
private String password;
private String cpassword;
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
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}
public Register(String name, String email, String contact, String password, String cpassword) {
	super();
	this.name = name;
	this.email = email;
	this.contact = contact;
	this.password = password;
	this.cpassword = cpassword;
}
public Register() {
	super();
}
@Override
public String toString() {
	return "Register [name=" + name + ", email=" + email + ", contact=" + contact + ", password=" + password
			+ ", cpassword=" + cpassword + "]";
}

}
