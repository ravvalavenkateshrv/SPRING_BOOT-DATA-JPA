package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
