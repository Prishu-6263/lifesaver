package com.example.lifesaver.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity
public class BloodRegistration {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
private String name;
private String bloodgroup;
private int number;
private String country;
private String state;
private String district;
private String city;
private String emial;
private String availability;


public BloodRegistration(Long id, String name, String bloodgroup, int number, String country, String state,
		String district, String city, String emial, String availability) {
	super();
	this.id = id;
	this.name = name;
	this.bloodgroup = bloodgroup;
	this.number = number;
	this.country = country;
	this.state = state;
	this.district = district;
	this.city = city;
	this.emial = emial;
	this.availability = availability;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBloodgroup() {
	return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
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
public String getEmial() {
	return emial;
}
public void setEmial(String emial) {
	this.emial = emial;
}
public String getAvailability() {
	return availability;
}
public void setAvailability(String availability) {
	this.availability = availability;
}
@Override
public String toString() {
	return "BloodRegistration [id=" + id + ", name=" + name + ", bloodgroup=" + bloodgroup + ", number=" + number
			+ ", country=" + country + ", state=" + state + ", district=" + district + ", city=" + city + ", emial="
			+ emial + ", availability=" + availability + "]";
}
public BloodRegistration(String name,String bloodgroup, int number, String country, String state, String district, String city,
		String emial, String availability) {
	super();
	this.name = name;
	this.number = number;
	this.country = country;
	this.state = state;
	this.district = district;
	this.city = city;
	this.emial = emial;
	this.availability = availability;
	this.bloodgroup=bloodgroup;	
}
public BloodRegistration() {
	super();
	// TODO Auto-generated constructor stub
}

}
