package com.nttdata.bootcamp.productservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProductServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceEurekaApplication.class, args);
	}

}
