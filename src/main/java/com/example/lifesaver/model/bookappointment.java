package com.example.lifesaver.model;

public class bookappointment {
private String name;
private String email;
private int contact;
private String date;
private String time;
private String state;
private String city;
private String searchdoctor;
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
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getSearchdoctor() {
	return searchdoctor;
}
public void setSearchdoctor(String searchdoctor) {
	this.searchdoctor = searchdoctor;
}
@Override
public String toString() {
	return "bookappointment [name=" + name + ", email=" + email + ", contact=" + contact + ", date=" + date + ", time="
			+ time + ", state=" + state + ", city=" + city + ", searchdoctor=" + searchdoctor + "]";
}
public bookappointment(String name, String email, int contact, String date, String time, String state, String city,
		String searchdoctor) {
	super();
	this.name = name;
	this.email = email;
	this.contact = contact;
	this.date = date;
	this.time = time;
	this.state = state;
	this.city = city;
	this.searchdoctor = searchdoctor;
}
public bookappointment() {
	super();
}

}
