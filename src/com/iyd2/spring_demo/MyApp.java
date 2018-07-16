package com.iyd2.spring_demo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkOut());
	}

}
