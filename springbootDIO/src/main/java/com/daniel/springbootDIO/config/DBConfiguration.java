package com.daniel.springbootDIO.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection(){
        System.out.println("Db connection for Dev - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Db Connection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection(){
        System.out.println("Db connection  for Production - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Db Connection to H2_TEST - Test instance";
    }
}
