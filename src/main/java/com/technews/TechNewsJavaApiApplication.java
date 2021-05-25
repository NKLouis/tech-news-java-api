package com.technews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")

@SpringBootApplication
public class TechNewsJavaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechNewsJavaApiApplication.class, args);
	}

}
