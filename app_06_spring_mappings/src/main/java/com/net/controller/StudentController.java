package com.net.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import com.net.entity.Address;
import com.net.entity.Student;
import com.net.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Component
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Transactional
	@Modifying
	public void addStudent()
	{
		

		Address address=new Address();
		
		address.setStreet("HYD");
	//	address.setAddressid("22");
		
		Student student=new Student();
	//	student.setId(2);
		student.setName("venkat");
		student.setAge(23);
		student.setAddress(address);
		
		studentRepository.save(student);
		
		
		
		
		
	}
	
	public void updateStudent()
	{
		Optional<Student> optStudent=studentRepository.findById(1);
		if(optStudent.isPresent())
		{
			Student student=optStudent.get();
			student.setName("Leela");
			
			Address address=new Address();
			address.setStreet("erramaurajupali");
			
			student.setAddress(address);
			
			studentRepository.save(student);
			
			System.out.println("successfully inserted");
			
			
		}
		
	}

}
