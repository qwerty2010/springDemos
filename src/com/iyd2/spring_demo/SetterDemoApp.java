package com.iyd2.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// call injected by setter object method
		System.out.println(theCoach.getDailyFortune());
		
		// call injected by setter literal values;
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());		
		// context close
		context.close();

	}

}
