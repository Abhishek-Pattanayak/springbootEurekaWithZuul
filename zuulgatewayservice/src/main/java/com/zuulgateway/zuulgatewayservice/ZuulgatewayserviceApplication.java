package com.zuulgateway.zuulgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulgatewayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgatewayserviceApplication.class, args);
	}

}
