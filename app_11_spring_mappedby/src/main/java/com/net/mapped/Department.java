package com.net.mapped;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int id;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employee;

}
