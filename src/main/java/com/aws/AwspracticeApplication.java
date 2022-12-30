package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwspracticeApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String getValue() {
		
		return  "Hi all....!!!";
	}

}
