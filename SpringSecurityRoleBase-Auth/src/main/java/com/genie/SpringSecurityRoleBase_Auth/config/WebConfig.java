package com.genie.SpringSecurityRoleBase_Auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder)
    {
        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder.encode("raja"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("user")
                .password(passwordEncoder.encode("user333"))
                .roles("USER")
                .build();

        return  new InMemoryUserDetailsManager(admin,user);

    }
@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(csrf -> csrf.disable()) // disable CSRF for simplicity
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/transfer").hasRole("ADMIN")
                        .requestMatchers("/update").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults()) // default login page
                .httpBasic(Customizer.withDefaults()); // basic auth

        return httpSecurity.build();
    }
}
