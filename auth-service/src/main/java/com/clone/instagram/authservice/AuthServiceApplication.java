package com.clone.instagram.authservice;

import com.clone.instagram.authservice.client.FacebookClient;
import com.clone.instagram.authservice.service.FacebookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableMongoAuditing
@Slf4j
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner init(FacebookService facebookClient) {
//		return args -> {
//		var token = facebookClient
//					.loginUser("EAABrnGMgIOYBAFwlU8LR1ZCgqYn8KqdENgWAfjJW93FkuWD7QHJ09JTKjZBJGhCQRUqXQ2ghYkfhyxZBvlqLhEI69L6Oum77JdH2dCYtdcHtVYtjclhXqVNX3mxd3ujPZBrf8XnZAsT4mMLXkpzZC7enS6YCiF4mWnHyp7ZBnBUSFxtDeYmtanAPyaWs6Q5aZAfTNLGc5g0FbZAAhob3s94LJa7cGArfRedcZD");
//
//			log.info(token);
//		};
//	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
