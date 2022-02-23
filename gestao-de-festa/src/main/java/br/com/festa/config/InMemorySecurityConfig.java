package br.com.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	AuthenticationManagerBuilder builder;
	
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("everton").password("Imb123").roles("USER")
			.and()
			.withUser("ulisses").password("Imb123").roles("USER");
				
	}
	
}
