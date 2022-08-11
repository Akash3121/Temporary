package com.lti.springdemo;


//way 1:using xml
public class Bean1 {
	private void init() throws Exception{
		System.out.println("bean1 init");

	}
	private void destroy() throws Exception{
		System.out.println("container is closed - bean 1 destroy");
	}

}
