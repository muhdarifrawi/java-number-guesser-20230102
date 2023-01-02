package com.accenture.numberGueser;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public Randomizer randomizer() {
		return new Randomizer();
	}
	
	@Bean
	public Players player() {
		return new Players("Noname", 0);
	}
}