package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.controller.EmployeeController;
import com.net.controller.TransactionController;

import jakarta.transaction.Transaction;

@SpringBootApplication
public class App03SpringPageSortApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	 SpringApplication.run(App03SpringPageSortApplication.class, args);
	TransactionController  controller=container.getBean(TransactionController.class);
	controller. getEmployeesData();

	}

}
