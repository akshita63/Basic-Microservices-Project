package com.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SenderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/send") 
	public String sendMessage(@RequestBody String message) 
	{ 
		String url = "http://localhost:8080/receive";
		//String message="Hi";
				
		return restTemplate.postForObject(url,message, String.class);
		}

}
