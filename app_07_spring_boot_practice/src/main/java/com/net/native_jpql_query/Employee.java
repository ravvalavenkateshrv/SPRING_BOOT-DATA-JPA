package com.net.native_jpql_query;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
public class Employee {
	
	
	@Id
	@Column(name="employee_id")
	private int id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="employee_age")
	private int age;
	
	@Column(name="employee_course")
	private String course;

}
