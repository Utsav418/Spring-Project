package com.utsav.springdemo;

public class BaseballCoach implements Coach {
	
	@Override 
	public String getDailyWorkOut() {
		return "spend 30 minutes on batting practice";
	}
}
