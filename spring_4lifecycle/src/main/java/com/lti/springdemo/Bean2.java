package com.lti.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//way 2: callback method //not preferable
public class Bean2 implements InitializingBean, DisposableBean{
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean 2 init");
		
	}
	
	@Override
	public void destroy() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("bean 2 destroy");

	}

}
