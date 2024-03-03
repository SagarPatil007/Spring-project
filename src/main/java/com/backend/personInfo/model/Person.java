package com.backend.personInfo.model;

public class Person {
	private String userName;
	private int age;
	private int salary;
	private String dob;
	private String phoneNo;
	
	public Person(String userName, int age, int salary, String dob, String phoneNo) {
		super();
		this.userName = userName;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Person [userName=" + userName + ", age=" + age + ", salary=" + salary + ", dob=" + dob + ", phoneNo="
				+ phoneNo + ", getUserName()=" + getUserName() + ", getAge()=" + getAge() + ", getSalary()="
				+ getSalary() + ", getDob()=" + getDob() + ", getPhoneNo()=" + getPhoneNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
