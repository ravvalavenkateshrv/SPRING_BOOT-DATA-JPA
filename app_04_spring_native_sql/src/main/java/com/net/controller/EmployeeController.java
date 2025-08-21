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
	
	public void getAllEmployeesSort()
	{
		List<Employee> emp=employeeRepository.findAll(Sort.by(Direction.DESC,"age"));
		emp.forEach(System.out::println);
	}
	
	
	public void getAllEmployeesPage(int page,int recordPage)
	{
		List<Employee> emp=	employeeRepository
				.findAll(PageRequest.of(page, recordPage,Sort.Direction.ASC,("employeeId")))
				.getContent();
		emp.forEach(System.out::println);
	}
	
	public void getEmployeeAge(int age)
	{
		List<Employee> emp=employeeRepository.findEmployeeByAge(age);
		emp.forEach(System.out::println);
	}
	
	
}

