package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.test.DatabaseOperations;

@SpringBootApplication
public class App02SpringJpaOperationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(App02SpringJpaOperationsApplication.class, args);
		DatabaseOperations dbOperations= container.getBean(DatabaseOperations.class);
		//dbOperations.addProduct();
		//dbOperations.findTheProduct();
		//dbOperations.findTheAllbyProducts();
		dbOperations.deleteTheAllProducts();
		
		
	}

}
