package com.wtd.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class configServerApplication {

	//@Value("${user.role}")
	//String role;


	public static void main(String[] args) {
		SpringApplication.run(configServerApplication.class, args);
	}

	/*
	public CommandLineRunner printValue() {
		return args -> {
			System.out.println(role);
		};
	}

	 */
}
