package com.example.lifesaver.model;

public class BloodHomePage {
private String bloodgroup;
private String country;
private String state;
private String district;
private String city;
public String getBloodgroup() {
	return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "BloodHomePage [bloodgroup=" + bloodgroup + ", country=" + country + ", state=" + state + ", district="
			+ district + ", city=" + city + "]";
}
public BloodHomePage(String bloodgroup, String country, String state, String district, String city) {
	super();
	this.bloodgroup = bloodgroup;
	this.country = country;
	this.state = state;
	this.district = district;
	this.city = city;
}
public BloodHomePage() {
	super();
}


}
