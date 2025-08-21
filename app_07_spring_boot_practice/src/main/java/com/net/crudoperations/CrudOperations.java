package com.net.crudoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrudOperations {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public void addStudentDetails()
	{
		Student student=new Student();
		student.setId(22);
		student.setName("");
		student.setAge(23);
		student.setCourse("java");
		
		studentRepository.save(student);
		System.out.println("successfully inserted");
	}
	
	public void addMoreStudentDetails()
	{
		List<Student> students = new ArrayList<>();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Alice");
		s1.setAge(22);
		s1.setCourse("Java");
		students.add(s1);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Bob");
		s2.setAge(23);
		s2.setCourse("Python");
		students.add(s2);

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Charlie");
		s3.setAge(21);
		s3.setCourse("C++");
		students.add(s3);

		Student s4 = new Student();
		s4.setId(4);
		s4.setName("David");
		s4.setAge(25);
		s4.setCourse("Spring Boot");
		students.add(s4);

		Student s5 = new Student();
		s5.setId(5);
		s5.setName("Eve");
		s5.setAge(22);
		s5.setCourse("JavaScript");
		students.add(s5);

		Student s6 = new Student();
		s6.setId(6);
		s6.setName("Frank");
		s6.setAge(24);
		s6.setCourse("React");
		students.add(s6);

		Student s7 = new Student();
		s7.setId(7);
		s7.setName("Grace");
		s7.setAge(23);
		s7.setCourse("Angular");
		students.add(s7);

		Student s8 = new Student();
		s8.setId(8);
		s8.setName("Hannah");
		s8.setAge(21);
		s8.setCourse("Node.js");
		students.add(s8);

		Student s9 = new Student();
		s9.setId(9);
		s9.setName("Ivy");
		s9.setAge(26);
		s9.setCourse("Kotlin");
		students.add(s9);

		Student s10 = new Student();
		s10.setId(10);
		s10.setName("Jack");
		s10.setAge(22);
		s10.setCourse("Go");
		students.add(s10);
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		
		studentRepository.saveAll(students);
		
		System.out.println("successfully inserted");

	}
	
	public void findTheStudent()
	{
		Optional<Student> optStudent=studentRepository.findById(2);
		
		Student student=optStudent.get();
		System.out.println(student);
	}
	
	public void studentExistOrNot()
	{
		boolean exists=studentRepository.existsById(234);
		System.out.println("*******"+exists+"************");
	}
	
	public void findTheAllStudents()
	{
	 Iterable<Student> students= studentRepository.findAll();
	 students.forEach(System.out::println);
	}
	
	public void findTheAllIdsStudents()
	{
		
		List<Integer> list=new ArrayList<>();
		list.add(288);
		list.add(3);
		Iterable<Student> iterableStudent=studentRepository.findAllById(list);
		iterableStudent.forEach(System.out::println);
		
	}
	
	public void deleteStudent()
	{
		
		boolean optStudent=studentRepository.existsById(2);
		if(optStudent)
		{
		studentRepository.deleteById(2);
		System.out.println("The Record is deleted");
		}else
		{
		  System.out.println("Record is not found");
			
		}
	}
	
	public void delteTheIdsStudents()
	{
		
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(6);
		studentRepository.deleteAllById(list);
		System.out.println("Successfully deleted");
	}

}
