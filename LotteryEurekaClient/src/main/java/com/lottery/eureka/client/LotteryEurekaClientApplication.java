package com.lottery.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class LotteryEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryEurekaClientApplication.class, args);
	}
}
