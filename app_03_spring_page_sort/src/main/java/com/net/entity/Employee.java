package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	
	@Id
	private int employeeId;
	private int age;
	private String salary;
	private String cityName;
	private String gender;
	private String country;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee(int employeeId, int age, String salary, String cityName, String gender, String country) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.salary = salary;
		this.cityName = cityName;
		this.gender = gender;
		this.country = country;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", age=" + age + ", salary=" + salary + ", cityName=" + cityName
				+ ", gender=" + gender + ", country=" + country + "]";
	}
	
	
	
	
	

}
