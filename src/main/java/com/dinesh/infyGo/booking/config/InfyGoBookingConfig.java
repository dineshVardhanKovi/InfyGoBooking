package com.dinesh.infyGo.booking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InfyGoBookingConfig {
	@Bean
	private RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
