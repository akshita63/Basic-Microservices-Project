package com.microservice1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SenderConfig {
	
	@Bean
	public RestTemplate restTemplate(){
		
		return new RestTemplate();
	}
	
	
	
	
	
	
	

}
