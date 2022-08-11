package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.springdemo.Bean1;
import com.lti.springdemo.Bean2;
import com.lti.springdemo.Bean3;


public class ClientApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Bean1 b1 = (Bean1)context.getBean("b1");
		Bean2 b2 =(Bean2)context.getBean("b2");
		Bean3 b3 =(Bean3)context.getBean("b3");

//		context.close();
		((AbstractApplicationContext) context).close();

	}
}
