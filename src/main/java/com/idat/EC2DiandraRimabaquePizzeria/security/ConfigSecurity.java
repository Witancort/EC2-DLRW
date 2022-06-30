package com.idat.EC2DiandraRimabaquePizzeria.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import net.bytebuddy.build.EntryPoint;




@Configuration
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
    private UserDetailService service;
    
    
	@Autowired
    private TokenFilter filter;
	
	
	private EntryPoint entrypoint;
	
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Diandra").password(encriptado().encode("123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password(encriptado().encode("123")).roles("USUARIO");
		
		auth.userDetailsService(service).passwordEncoder(encriptado());
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/pizza/v1/**").access("hasRole('ADMIN')")
		.and()
		.httpBasic()
		.and()
		.csrf().disable();
		
		
		http.authorizeRequests()
	    .antMatchers("/crearToken").permitAll()
	    .anyRequest()
	    .authenticated()
	    .and()
	    .exceptionHandling()
	    .authenticationEntryPoint(null)
	    .and()
	    .sessionManagement()
	    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	    .and()
	    .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
	    .csrf().disable();
		
	}
	
	@Bean
	public PasswordEncoder encriptado() {
		
		return new BCryptPasswordEncoder();
	}

	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}

	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}		

}