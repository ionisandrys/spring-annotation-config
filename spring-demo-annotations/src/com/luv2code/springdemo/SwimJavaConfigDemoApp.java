package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from spring container
		Coach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method in the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call out new methods
		System.out.println("email: "+((SwimCoach) theCoach).getEmail());
		
		System.out.println("team: "+((SwimCoach) theCoach).getTeam());
		
		
		
		// close context
		context.close();

	}

}
