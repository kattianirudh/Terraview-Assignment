package com.example.Terraview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TerraviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerraviewApplication.class, args);
	}


}
