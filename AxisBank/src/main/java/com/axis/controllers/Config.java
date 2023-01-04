package com.axis.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan({"com.axis.controllers"})
public class Config {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver reslover=new InternalResourceViewResolver();
		reslover.setSuffix(".jsp");
		return reslover;
	}
}
