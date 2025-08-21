package com.net.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneToManyOperations {
	
	@Autowired
	private ProjectRepository projectRepositoy;
	
	public void addProjectDetails()
	{
		Employee emp=new Employee();
		emp.setId(50);
		emp.setName("leela");
		
		Employee emp2=new Employee();
		emp2.setId(60);
		emp2.setName("jagadeesh");
		
		Project project=new Project();
		project.setId(100);
		project.setName("backend developement");
		
		project.setEmployee(List.of(emp,emp2));
		
		
		projectRepositoy.save(project);
		
		
	     System.out.println("Successfully inserted");
	}
	
	
	
}
