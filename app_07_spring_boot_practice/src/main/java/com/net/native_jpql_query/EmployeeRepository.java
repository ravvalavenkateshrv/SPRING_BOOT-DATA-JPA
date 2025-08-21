package com.net.native_jpql_query;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query(value="SELECT * FROM jpa_practice.employee;",nativeQuery=true)
	public  List<Employee> findTheAllEmployees();
	
	@Transactional
	@Modifying
	@Query(value="delete from jpa_practice.employee where employee_id=:id",nativeQuery=true)
	public void deleteEmployee(int id);
	
	
	@Query(value="SELECT e FROM Employee e",nativeQuery=false)
	public  List<Employee> findTheAllEmployeesNative();
	
}
