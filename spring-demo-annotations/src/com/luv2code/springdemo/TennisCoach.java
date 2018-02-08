package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println("inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("Inside of Startup");
	}
	
	@PreDestroy
	public void doMyCleanupStaff(){
		System.out.println("CleanUp");
	}
	
	
	
	
	
	/*
	@Autowired
	public void crazy(FortuneService theFortuneService){
		System.out.println("inside crazy");
		fortuneService = theFortuneService;
	}*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice backhand volley";
		}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
