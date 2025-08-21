package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.controller.EmployeeController;

@SpringBootApplication
public class App03SpringPageSortApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	 SpringApplication.run(App03SpringPageSortApplication.class, args);
	EmployeeController controller=container.getBean(EmployeeController.class);
	controller.employeePageAndSort(0, 5);
	}

}
