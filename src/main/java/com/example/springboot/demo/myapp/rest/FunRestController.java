package com.example.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
	
	// inject properties for coach.name and team.name
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	// expose new endpoint for "teaminfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + " , Team Name: " + teamName;
	}
	
	//expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}
	

}
