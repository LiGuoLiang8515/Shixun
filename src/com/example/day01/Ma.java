package com.example.day01;

public class Ma {
	int age;
	String gender;
	String grades;
	String name;
	float weight;
	public Ma(int age, String gender, String grades, String name, float weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.grades = grades;
		this.name = name;
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Ma [age=" + age + ", gender=" + gender + ", grades=" + grades + ", name=" + name + ", weight=" + weight
				+ "]";
	}
}
