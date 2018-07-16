package com.iyd2.spring_demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard five kilometres";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}
	
	// add an init method
	public void initMethod() {
		System.out.println("TrackCoach: inside of init method");
	}
	
	// add an destroy method
	public void destroyMethod() {
		System.out.println("TrackCoach: inside of destroy method");
	}
	
}
