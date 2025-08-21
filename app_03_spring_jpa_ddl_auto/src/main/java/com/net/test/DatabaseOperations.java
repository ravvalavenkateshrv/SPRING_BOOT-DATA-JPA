package com.net.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.net.repository.StudentRepository;

@Component
public class DatabaseOperations {
	
	@Autowired
	private StudentRepository studentRepository;
	public void findTheStudent()
	{
		studentRepository.findAll();
	}

}
