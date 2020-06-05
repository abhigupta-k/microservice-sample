package com.abhi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZPaymentServiceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZPaymentServiceMicroserviceApplication.class, args);
	}

}
