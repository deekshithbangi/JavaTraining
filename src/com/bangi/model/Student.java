package com.bangi.model;

public class Student {
	private String name;
	private int age;
	private int rollnumber;

	public Student() {
		this.name = "";
		this.age = 0;
		this.rollnumber = 0;
	}

	public Student(String name, int age, int rollnumber) {
		this.name = name;
		this.age = age;
		this.rollnumber = rollnumber;
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

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

}
