package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.onetTomany.OneToManyOperations;


@SpringBootApplication
public class App08SpringBootPracticeMappingsApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App08SpringBootPracticeMappingsApplication.class, args);
	
	}

}
