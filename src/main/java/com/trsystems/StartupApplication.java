package com.trsystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
/* @EnableConfigServer 
 * Transforma sua aplicação em um servidor central de configurações.
 * Habilita o Config Server dp Spring Cloud Config
 */ 
public class StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartupApplication.class, args);
	}

}
