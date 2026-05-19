package com.additional.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
    	String[] beanNames = context.getBeanDefinitionNames();
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}

		User user=context.getBean("user",User.class);
		User user2=context.getBean("user",User.class);
		User user3=context.getBean("user",User.class);
//		user.name="Ali";
		System.out.println(user.name);
		user.printAddress();

		School school=context.getBean(School.class);

		school.printAddress();

		Order order=context.getBean(Order.class);
		order.processOrder();
	}

}
