package com.care.aged.AgedCareArt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AgedCareArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgedCareArtApplication.class, args);
	}

}
