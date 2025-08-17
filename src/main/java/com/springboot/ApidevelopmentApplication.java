package com.springboot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import jdk.jfr.Description;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.Descriptor;

@OpenAPIDefinition(
		info = @Info(
				title = "Student Service Rest Api Documentation",
				description = "Student Service Rest Api",
				version = "v1",
				contact = @Contact(
						name = "Mallanagouda Honaraddi",
						email = "malluhonaraddi18@gmail.com"
				)
		)
)
@SpringBootApplication
public class ApidevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidevelopmentApplication.class, args);
	}

}
