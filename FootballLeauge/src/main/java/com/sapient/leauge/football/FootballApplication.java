package com.sapient.leauge.football;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootballApplication {

	static Logger logger = Logger.getLogger(FootballApplication.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
        logger.debug("Starting Spring boot main class");
        
		SpringApplication.run(FootballApplication.class, args);
	}

}
