package com.axis.shoppingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingserviceApplication.class, args);
	}

	@LoadBalanced
    @Bean
    public RestTemplate getTemplate () {
                return new RestTemplate();

    }
}
