package com.dio.bradesco_dev_week;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "default server URL")})
@SpringBootApplication
public class BradescoDevWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(BradescoDevWeekApplication.class, args);
	}

}
