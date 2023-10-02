package com.example.lifesaver.model;

public class ForgotPassword {
private String email;
private String password;
private String cpassword;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
@Override
public String toString() {
	return "ForgotPassword [email=" + email + ", password=" + password + ", cpassword=" + cpassword + "]";
}
public ForgotPassword() {
	super();
	// TODO Auto-generated constructor stub
}
public ForgotPassword(String email, String password, String cpassword) {
	super();
	this.email = email;
	this.password = password;
	this.cpassword = cpassword;
}

}
