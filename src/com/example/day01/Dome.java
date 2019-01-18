package com.example.day01;

public class Dome {
	String name;
	String location;
	String job;
	public Dome(String name, String location, String job) {
		super();
		this.name = name;
		this.location = location;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Dome [name=" + name + ", location=" + location + ", job=" + job + "]";
	}
}
