package com.yoga.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(YogaApplication.class);
	}
	public static void main(String[] args) throws Exception {
        SpringApplication.run(YogaApplication.class, args);
    }
}
