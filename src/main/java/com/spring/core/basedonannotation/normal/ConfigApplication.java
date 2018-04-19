package com.spring.core.basedonannotation.normal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.basedonannotation.normal.bean.Green;

@Configuration
public class ConfigApplication {
	
	@Bean(name="green")
	public Green getGreen() {
		return new Green();
	}
}
