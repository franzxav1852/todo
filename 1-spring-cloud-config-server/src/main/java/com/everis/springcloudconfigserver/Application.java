package com.everis.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer 
//Habilita este proyecto como servidor de la configuracion
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
