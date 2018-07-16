package com.iyd2.spring_demo;

import java.util.Random;

public class MyFortuneService implements FortuneService {
	
	private String[] fortunes = {"1", "2", "3"};

	@Override
	public String getFortune() {
		Random rn = new Random();
		return fortunes[rn.nextInt(3)];
	}

}
