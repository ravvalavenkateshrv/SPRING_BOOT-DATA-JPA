package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.net.entity.Employee;
import com.net.entity.Project;
import com.net.repository.EmployeeRepository;
import com.net.repository.ProjectRepository;

@Component
public class ProjectController {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addProjectDetails()
	{
		
		
		Project project=new Project();
		project.setProjectId(11);
		project.setProjectName("Web development");
		
		
		Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setEmpName("venkat");
		
		Employee emp2=new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("pavithra");
		
		project.setEmployee(List.of(emp,emp2));
		
		projectRepository.save(project);
		
		
		
		
	}

}
