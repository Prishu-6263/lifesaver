package com.example.lifesaver.model;

public class OrganRegistration {
private String fname;
private String mname;
private String lname;
private String email;
private int age;
private int phone;
private  String gender;
private String address;
private String city;
private String state;
private int pincode;
private String district;
private String organ_type;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getOrgan_type() {
	return organ_type;
}
public void setOrgan_type(String organ_type) {
	this.organ_type = organ_type;
}
public OrganRegistration(String fname, String mname, String lname, String email, int age, int phone, String gender,
		String address, String city, String state, int pincode, String district, String organ_type) {
	super();
	this.fname = fname;
	this.mname = mname;
	this.lname = lname;
	this.email = email;
	this.age = age;
	this.phone = phone;
	this.gender = gender;
	this.address = address;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	this.district = district;
	this.organ_type = organ_type;
}
public OrganRegistration() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "OrganRegistration [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", email=" + email + ", age="
			+ age + ", phone=" + phone + ", gender=" + gender + ", address=" + address + ", city=" + city + ", state="
			+ state + ", pincode=" + pincode + ", district=" + district + ", organ_type=" + organ_type + "]";
}





}
