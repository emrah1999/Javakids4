package com.book.spring_project;

import com.book.spring_project.newBean.*;
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

		Computer computer=context.getBean("computer",Computer.class);
		Computer computer1=(Computer) context.getBean("computer1");
		Computer computer2=(Computer) context.getBean("computer2");
		Computer computer3=(Computer) context.getBean("computer3");


		Student student=context.getBean("student",Student.class);
		Student student1=context.getBean("student1",Student.class);
		Student student2=context.getBean("student2",Student.class);
		System.out.println(student.name);
		System.out.println(student1.name);
		System.out.println(student2.name);

		Library library=context.getBean(Library.class);
//		Engine engine=context.getBean(Engine.class);
//		Engine engine2=context.getBean(Engine.class);
//		Engine engine3=context.getBean(Engine.class);

		System.out.println(library.name+" "+library.location);

		System.out.println(computer.brand);
		System.out.println(computer1.brand);
		System.out.println(computer2.brand);
		System.out.println(computer3.brand);

		CarService carService=context.getBean(CarService.class);

		carService.startCar();
		carService.startCar();
		carService.startCar();



//		Car car=context.getBean(Car.class);
//
//		Car car2=context.getBean(Car.class);
//		Car car3=context.getBean(Car.class);
//		Car car4=context.getBean(Car.class);
//
////		Person person=context.getBean(Person.class);
//
//		System.out.println(car==car2);
//
//		User user= (User) context.getBean("newUserBean");
//		System.out.println(user.name);




	}

}
