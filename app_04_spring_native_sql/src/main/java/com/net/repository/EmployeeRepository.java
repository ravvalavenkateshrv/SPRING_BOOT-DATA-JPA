package com.net.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.net.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	@Query(value="SELECT * FROM jpa.employee where age>:age;",nativeQuery=true)
	public List<Employee> findEmployeeByAge(int age);
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO jpa.employee VALUES (10451, 25, '50000', 'Mumbai', 'Male', 'India')",nativeQuery=true)
	public int saveEmployee();
	
	
	@Query(value="select e from Employee e",nativeQuery=false)
	public List<Employee> getallEmployees();
	
	
}

