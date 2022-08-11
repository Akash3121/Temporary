package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.beans.Employee;
import com.lti.services.EmpService;


public class UserApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		EmpService service = (EmpService) context.getBean("empService");
		
		/*
		 * Employee e = new Employee(); e.setEmpName("Sanjay"); e.setEmpSal(80000);
		 * 
		 * int empNo= service.addEmployee(e);
		 */
//		System.out.println(empNo);
		
//		((AbstractApplicationContext) context).close();
	}

}
