package com.lti.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean3 {
	
	@PostConstruct
	public void init() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("bean 3 init");
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("bean 3 destroy");
	}

}
