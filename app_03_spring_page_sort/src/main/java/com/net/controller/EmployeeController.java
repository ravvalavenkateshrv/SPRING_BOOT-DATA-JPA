package com.net.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.net.entity.Employee;
import com.net.repository.EmployeeRepository;


@Component
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void saveAlllEmployee() {
	    List<Employee> listemployee = new ArrayList<>();

	    listemployee.add(new Employee(7, 25, "50000", "Hyderabad", "Male", "India"));
	    listemployee.add(new Employee(3, 30, "60000", "Mumbai", "Female", "India"));
	    listemployee.add(new Employee(10, 28, "55000", "Chennai", "Male", "India"));
	    listemployee.add(new Employee(1, 35, "70000", "Delhi", "Female", "India"));
	    listemployee.add(new Employee(5, 22, "48000", "Bangalore", "Male", "India"));
	    listemployee.add(new Employee(8, 40, "75000", "Pune", "Female", "India"));
	    listemployee.add(new Employee(2, 29, "53000", "Kolkata", "Male", "India"));
	    listemployee.add(new Employee(6, 26, "52000", "Jaipur", "Female", "India"));
	    listemployee.add(new Employee(9, 33, "67000", "Ahmedabad", "Male", "India"));
	    listemployee.add(new Employee(4, 31, "59000", "Lucknow", "Female", "India"));

	    employeeRepository.saveAll(listemployee);
	}

	
	public void FindTheAllEmployees()
	{
		List<Employee> employes=employeeRepository.findAll();
		employes.forEach(System.out::println);
	}
	
	public void findAlllEmployeeSorting()
	{
		List<Employee> employees=employeeRepository.findAll(Sort.by(Direction.DESC,"employeeId"));
		
		employees.forEach(System.out::println);
	}
	
	public void getEmployeePaging()
	{
	Page<Employee> pageEmployee=	employeeRepository.findAll(Pageable.ofSize(5));
	List<Employee> employees=pageEmployee.getContent();
	
	employees.forEach(System.out::println);
		
	}
	
	public void employeeDetailsPageNumber(int pageNumber,int recordPage)
	{
		List<Employee> employees=	employeeRepository.findAll(PageRequest.of(pageNumber, recordPage)).getContent();
		System.out.println("printing the records*****************");
		employees.forEach(System.out::println);
	}
	
	public void employeePageAndSort(int pageNumber, int records)
	{
		List<Employee> emp=employeeRepository.findAll(PageRequest.of(pageNumber, records)).getContent();
		emp.forEach(System.out::println);
	}
	

}

