package com.net.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="project_mapping")
public class Project {
	
	
	@Id
	private int projectId;
	private String projectName;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable
	( name="project_employee_name",
	joinColumns= @JoinColumn(name="project_id"),
	inverseJoinColumns= @JoinColumn(name="emp_id")
			
			)
	private List<Employee> employee;

}
