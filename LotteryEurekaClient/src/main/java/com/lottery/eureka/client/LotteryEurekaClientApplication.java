package com.lottery.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class LotteryEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryEurekaClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hello world  server port:" + port +"  params names value is :"+name;
	}
}
