package com.iyd2.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		// load a sprig configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// get Coach beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// close context
		context.close();
		

	}

}
