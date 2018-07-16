package com.iyd2.spring_demo;

public class BaseballCoach implements Coach {
	
	// define a private field for a dependency injection
	private FortuneService fortuneService;
	
	// define a constructor for a dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
