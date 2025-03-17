package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
@Id
int ID;
String name,city;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Student [ID=" + ID + ", name=" + name + ", city=" + city + "]";
}
}
