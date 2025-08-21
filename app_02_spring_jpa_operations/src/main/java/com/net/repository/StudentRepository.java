package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
