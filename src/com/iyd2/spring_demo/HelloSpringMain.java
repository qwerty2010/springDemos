package com.iyd2.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringMain {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean froam a bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// call method of injected object
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
