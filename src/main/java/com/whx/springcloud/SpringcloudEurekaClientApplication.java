package com.whx.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class SpringcloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
	}
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/hi")
	public String hi(@RequestParam String name) {
		return "hi" + name + ", I am from port:" + port;
	}
}
