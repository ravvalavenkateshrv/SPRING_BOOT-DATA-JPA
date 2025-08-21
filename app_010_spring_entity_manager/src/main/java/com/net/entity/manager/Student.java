package com.net.entity.manager;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="student_entity")
public class Student {
	
	
	@Id
	private int id;
	private String name;

}
