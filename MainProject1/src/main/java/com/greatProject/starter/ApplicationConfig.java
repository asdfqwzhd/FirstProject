package com.greatProject.starter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@SpringBootApplication
@ImportResource(
		"classpath:/META-INFO/spring/auto/web/*-config.xml"
		)
public class ApplicationConfig {

}
