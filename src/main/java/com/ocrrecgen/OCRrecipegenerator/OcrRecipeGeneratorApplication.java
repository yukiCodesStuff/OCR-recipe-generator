package com.ocrrecgen.OCRrecipegenerator;

import com.ocrrecgen.OCRrecipegenerator.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
@RestController
public class OcrRecipeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrRecipeGeneratorApplication.class, args);
	}

	@GetMapping(value = "/")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping(value = "/example-user")
	public User exampleUser() {
		return new User(
				Long.valueOf(1),
				"Yuki Janvier",
				"jane.doe@gmail.com",
				LocalDate.now(),
				99
		);
	}

}
