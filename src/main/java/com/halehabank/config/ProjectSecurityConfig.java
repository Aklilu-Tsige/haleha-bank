package com.halehabank.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * /account - Secured
     * /balance - Secured
     * /cards - Secured
     * /contact -Not Secured
     * /loans - Secured
     * /notices - Not Secured
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/account").authenticated()
                .antMatchers("/balance").authenticated()
                .antMatchers("/cards").authenticated()
                .antMatchers("/loans").authenticated()
                .antMatchers("/contact").permitAll()
                .antMatchers("/notices").permitAll()
                .and()
                .formLogin().and()
                .httpBasic();

    }
}
