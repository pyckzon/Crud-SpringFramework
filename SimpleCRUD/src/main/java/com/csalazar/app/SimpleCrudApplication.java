package com.csalazar.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SimpleCrudApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {

	private static final Logger logger = (Logger) LogManager.getLogger(SimpleCrudApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
		logger.info("Iniciando Application");
	}

}
