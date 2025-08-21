package com.net.entity.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Component
public class StudentController {
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Transactional
	public void addStudent()
	{
		Student student=new Student();
		student.setId(11);
		student.setName("venkat");
		
		entityManager.persist(student);
		
		System.out.println("Successfully inserted");
	}

}
