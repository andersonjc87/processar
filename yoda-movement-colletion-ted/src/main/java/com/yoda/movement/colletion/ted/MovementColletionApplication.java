package com.yoda.movement.colletion.ted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "com.yoda.movement.colletion.ted")
@EnableAutoConfiguration
public class MovementColletionApplication extends SpringBootServletInitializer {
	
	public MovementColletionApplication() {
	    super();
	    setRegisterErrorPageFilter(false); // <- this one
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(MovementColletionApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MovementColletionApplication.class, args);
	}

}

