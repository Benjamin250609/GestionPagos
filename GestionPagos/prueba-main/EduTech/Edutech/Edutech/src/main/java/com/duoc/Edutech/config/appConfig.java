package com.duoc.Edutech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class appConfig {
    @Bean
    public RestTemplate restemplate() {
        return new RestTemplate();
    }
}
