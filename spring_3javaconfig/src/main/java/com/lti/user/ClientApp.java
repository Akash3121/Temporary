package com.lti.user;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.config.JavaConfig;
import com.lti.springdemo.Address;
import com.lti.springdemo.Employee;

public class ClientApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee e = context.getBean(Employee.class);
		e.setEmpName("Jay");
		System.out.println(e);
		
		Address a = context.getBean(Address.class);
		a.setCity("Hyderabad");
		a.setState("Telangana");
		System.out.println(a);
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	
//		
//		Employee e1 = (Employee) context.getBean("e1");
//		System.out.println(e1);
////		e1.displayInfo();
//		System.out.println("\n");
//		
//		Employee e2 = (Employee) context.getBean("e1");
//		System.out.println(e2);
		
	}
}
