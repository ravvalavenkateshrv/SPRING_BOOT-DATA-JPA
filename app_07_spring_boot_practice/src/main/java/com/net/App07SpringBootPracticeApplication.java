package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.crudoperations.CrudOperations;
import com.net.native_jpql_query.NativeAndJpqlOperations;
import com.net.onetoone.mapping.Operations;
import com.net.page_sort.PageAndSortOperations;

@SpringBootApplication
public class App07SpringBootPracticeApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App07SpringBootPracticeApplication.class, args);
	 Operations operations=container.getBean(Operations.class);
	 operations.addStuden();
	
	}

}
