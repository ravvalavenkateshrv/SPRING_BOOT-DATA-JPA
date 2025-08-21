package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.net.entity.Employee;
import com.net.repository.EmployeeRepository;


@Component
public class TransactionController {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void insertEmployee()
	{
		System.out.println("Insert Employee");
	
	int count=	employeeRepository.saveEmployee();
	System.out.println(count);
		
	}
	
	public void getEmployeesData()
	{
		List<Employee> emp=employeeRepository.getallEmployees();
		emp.forEach(System.out::println);
	}
	

}
