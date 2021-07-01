package com.icr7.covid19;

public class Details {
	private String name;
	private int age;
	private boolean status;
	private String location;

	// Constructor
	public Details(String name, int age, boolean status, String location) {
		super();
		this.name = name;
		this.age = age;
		this.status = status;
		this.location = location;
	}

	// Getter-Setter
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
