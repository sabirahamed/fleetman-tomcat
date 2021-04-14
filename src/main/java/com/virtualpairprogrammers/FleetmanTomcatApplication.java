package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
/*@ServletComponentScan(basePackages = { 
	     "com.virtualprogrammers.listener",
	     "com.virtualprogrammers.controllers",
	     "com.virtualprogrammers.data",
	     "com.virtualprogrammers.domain",
	     "com.virtualprogrammers.services"
	   })*/
@EnableScheduling
public class FleetmanTomcatApplication extends SpringBootServletInitializer {
	
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(FleetmanTomcatApplication.class);
	   }
	public static void main(String[] args) {
		SpringApplication.run(FleetmanTomcatApplication.class, args);		
	}	
}

