package com.book.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.FileWriter;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);

		String[] beanNames = context.getBeanDefinitionNames();

		for (String bean : beanNames) {
			System.out.println(bean);
		}

		Car car=context.getBean(Car.class);

		Car car2=context.getBean(Car.class);
		Car car3=context.getBean(Car.class);
		Car car4=context.getBean(Car.class);

//		Person person=context.getBean(Person.class);

		System.out.println(car==car2);

		User user= (User) context.getBean("newUserBean");
		System.out.println(user.name);




	}

}
