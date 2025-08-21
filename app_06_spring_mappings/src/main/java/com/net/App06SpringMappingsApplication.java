package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.controller.CartController;
import com.net.controller.ProjectController;
import com.net.controller.StudentController;

@SpringBootApplication
public class App06SpringMappingsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(App06SpringMappingsApplication.class, args);
	
		ProjectController controller=container.getBean(ProjectController.class);
		controller.addProjectDetails();
		 
	}

}
