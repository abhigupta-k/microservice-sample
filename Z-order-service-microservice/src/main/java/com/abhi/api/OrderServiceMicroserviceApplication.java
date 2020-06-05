package com.abhi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceMicroserviceApplication.class, args);
	}

	@Bean
	@LoadBalanced  // if not write it give 5oo error and not running application name as alocalohost
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
