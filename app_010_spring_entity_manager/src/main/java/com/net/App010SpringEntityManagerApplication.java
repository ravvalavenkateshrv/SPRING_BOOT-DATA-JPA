package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.entity.manager.StudentController;

@SpringBootApplication
public class App010SpringEntityManagerApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App010SpringEntityManagerApplication.class, args);
	StudentController controller=container.getBean(StudentController.class);
	controller.addStudent();
	}

}
