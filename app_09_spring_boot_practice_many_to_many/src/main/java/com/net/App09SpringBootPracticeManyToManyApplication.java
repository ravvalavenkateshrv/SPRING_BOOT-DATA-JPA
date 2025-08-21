package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.manytomany.OneToManyOperations;

@SpringBootApplication
public class App09SpringBootPracticeManyToManyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App09SpringBootPracticeManyToManyApplication.class, args);
	OneToManyOperations operations=container.getBean(OneToManyOperations.class);
	operations.addProjectDetails();
		
	}

}
