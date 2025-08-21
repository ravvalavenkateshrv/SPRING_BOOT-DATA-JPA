package com.net.native_jpql_query;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NativeAndJpqlOperations {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addEmployees()
	{
		
		List<Employee> employees = new ArrayList<>();

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Alice");
		e1.setAge(25);
		e1.setCourse("Java");
		employees.add(e1);

		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("Bob");
		e2.setAge(28);
		e2.setCourse("Spring Boot");
		employees.add(e2);

		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("Charlie");
		e3.setAge(24);
		e3.setCourse("Python");
		employees.add(e3);

		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("David");
		e4.setAge(26);
		e4.setCourse("JavaScript");
		employees.add(e4);

		Employee e5 = new Employee();
		e5.setId(105);
		e5.setName("Eva");
		e5.setAge(23);
		e5.setCourse("React");
		employees.add(e5);

		Employee e6 = new Employee();
		e6.setId(106);
		e6.setName("Frank");
		e6.setAge(29);
		e6.setCourse("Angular");
		employees.add(e6);

		Employee e7 = new Employee();
		e7.setId(107);
		e7.setName("Grace");
		e7.setAge(27);
		e7.setCourse("Node.js");
		employees.add(e7);

		Employee e8 = new Employee();
		e8.setId(108);
		e8.setName("Hannah");
		e8.setAge(25);
		e8.setCourse("Kotlin");
		employees.add(e8);

		Employee e9 = new Employee();
		e9.setId(109);
		e9.setName("Ian");
		e9.setAge(30);
		e9.setCourse("C#");
		employees.add(e9);

		Employee e10 = new Employee();
		e10.setId(110);
		e10.setName("Jack");
		e10.setAge(22);
		e10.setCourse("Go");
		employees.add(e10);

		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		
		employeeRepository.saveAll(employees);
		
		System.out.println("Successfully inserted");
	}
	
	
	public void getAllTheEmployees()
	{
		List<Employee> employees=employeeRepository.findTheAllEmployeesNative();
		employees.forEach(System.out::println);
	}
	
	
	public void deleteTheEmployee(int id)
	{
		employeeRepository.deleteEmployee(id);
		System.out.println("Successfully deleted");
	}
	
}
