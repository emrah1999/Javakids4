package com.book.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.FileWriter;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
		String[] beans=context.getBeanDefinitionNames();

		for (String bean : beans) {
			System.out.println(bean);
		}

		Car car=context.getBean(Car.class);
		System.out.println(car.brand+" "+car.model);

//		User user=context.getBean(User.class);

		Book book=context.getBean(Book.class);
		System.out.println(book.title);

	}

}
