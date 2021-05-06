package com.university.University.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailServiceImpl userDetailsService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
//@Override
    //protected void configure(HttpSecurity http) throws Exception {
    //    http.authorizeRequests().anyRequest().permitAll();
  //  }
//}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/","/public/**","/css/**").permitAll()
		
		.and()
			.formLogin().loginPage("/auth/login").defaultSuccessUrl("/private/inscripcion",true)
			.loginProcessingUrl("/auth/inscripcion").loginProcessingUrl("/auth/admin").permitAll()
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/private/inscripcion");
	}
}
