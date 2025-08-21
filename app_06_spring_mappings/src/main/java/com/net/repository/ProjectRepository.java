package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
