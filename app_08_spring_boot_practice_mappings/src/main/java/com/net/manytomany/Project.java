package com.net.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
@Data

public class Project {
	
	@Id
	private int id;
    private String name;
    
   @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
   @JoinTable(name="project_empl",
                joinColumns= @JoinColumn(name="project_id"),
                inverseJoinColumns =@JoinColumn(name="employee_id"))
    private List<Employee> employee;

}
