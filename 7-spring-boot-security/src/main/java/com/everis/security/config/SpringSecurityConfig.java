package com.everis.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//{noop} no op password encoder, no es recomendable guardarlo asi.
		auth.inMemoryAuthentication()
		.withUser("usuario").password("{noop}passworld").roles("USER")
		.and()
		.withUser("admin").password("{noop}passworld").roles("ADMIN", "USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/paises/**").hasRole("USER")
		.antMatchers(HttpMethod.POST, "/paises/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.DELETE, "/paises/**").hasRole("ADMIN")
		.and()
		.csrf().disable() //peticiones desde otro servidor.
		.formLogin().disable(); //No hay un formulario de login
	}
	

}
