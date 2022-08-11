package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.springdemo.spring_1basics.Employee;

public class ClientApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//IOC- Inversion of Control -> instead dev manually, control is manually is inverted to spring
		//DI - Dependency Injection
		//loose coupling - object of OOP
		
		//way - 1: xml file config //way - 2: Annotations //way - 3: Java configurations
		
		Employee e1 = (Employee) context.getBean("e1");
		
		System.out.println(e1);
//		e1.displayInfo();
//		System.out.println("\n");
		
//		Employee e2 = (Employee) context.getBean("e2");
//		System.out.println(e2);
		
	}
}
