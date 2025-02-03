package com.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {
	
	@PostMapping("/receive")
	public String receiveMessage(@RequestBody String message)
	{
		if ("hi".equalsIgnoreCase(message))
		{
			return "hello"; 
			}
		return "unknown message";
		} 
	}
	
	


