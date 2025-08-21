package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="employee_mapping")
public class Employee {
	
	
	@Id
	private int empId;
	private String empName;

}
