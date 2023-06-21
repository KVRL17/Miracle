package com.example.jdbcspring;

public class Student {
private int id;
private String name;
private int age;
private int average;

private String photos;
public String getPhotos() {
	return photos;
}
public void setPhotos(String photos) {
	this.photos = photos;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getAverage() {
	return average;
}
public void setAverage(int average) {
	this.average = average;
}

}
