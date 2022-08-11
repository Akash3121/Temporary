package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.springdemo.spring_1basics.Employee;

public class ClientApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
		
		Employee e1 = (Employee) context.getBean("e1");
		System.out.println(e1);
//		e1.displayInfo();
		System.out.println("\n");
		
		Employee e2 = (Employee) context.getBean("e1");
		System.out.println(e2);
		
	}
}
