package com.iyd2.spring_demo;

public class CricketCoach implements Coach {
	
	// Property value that will be injected
	private String email;

	private String team;
	
	// Property object that will be injected
	private FortuneService fortuneService;
	
	// Create a no-args constructor.
	// It will be used by object factory.
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setEmail");
		this.email = email;
	}


	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setTeam");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// Injected Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practise fast bowling 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
