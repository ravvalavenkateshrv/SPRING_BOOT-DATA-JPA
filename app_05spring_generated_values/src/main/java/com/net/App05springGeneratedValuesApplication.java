package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.entity.controller.ProductController;

@SpringBootApplication
public class App05springGeneratedValuesApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App05springGeneratedValuesApplication.class, args);
	ProductController controller=container.getBean(ProductController.class);
	for(int i=0;i<=10;i++)
	{
		controller.addEmployee();
	}
	controller.findAllProducts();
	}

}
