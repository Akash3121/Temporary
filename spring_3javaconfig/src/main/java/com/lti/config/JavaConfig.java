package com.lti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lti.springdemo.Address;
import com.lti.springdemo.Employee;



@Configuration
public class JavaConfig {
	
	@Bean
	public Employee getEmp()
	{
		return new Employee();
	}
	@Bean
	public Address getAdd()
	{
		return new Address();
	}

}
