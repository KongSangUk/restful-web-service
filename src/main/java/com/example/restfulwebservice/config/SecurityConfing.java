package com.example.restfulwebservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfing extends WebSecurityConfigurerAdapter {

    @Autowired
    private void configureGlobal(AuthenticationManagerBuilder auth)
        throws Exception{
        auth.inMemoryAuthentication()
                .withUser("ksu")
                .password("123")
                .roles("USER");
    }
}
