package com.divyaraj.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinMaven2Application {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to gl ************************************good enjoy";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinMaven2Application.class, args);
	}

}
