package com.nagarro.nagp.servicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.nagarro.nagp")
public class NagpTestService2Application {

	public static void main(String[] args) {
		SpringApplication.run(NagpTestService2Application.class, args);
	}

}
