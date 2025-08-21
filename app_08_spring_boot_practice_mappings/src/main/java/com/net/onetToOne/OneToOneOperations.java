package com.net.onetToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneToOneOperations {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void addStuden()
	{
		
		Address address=new Address();
		address.setId(1);
		address.setStreet("Tpt");
		
		
		
		Student student=new Student();
		student.setId(11);
		student.setName("venkat");
		student.setAge(23);
		student.setAddress(address);

		studentRepository.save(student);
		
		System.out.println("successfully inserted");
		
	}

}
