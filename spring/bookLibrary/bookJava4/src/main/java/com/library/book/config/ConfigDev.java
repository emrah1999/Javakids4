package com.library.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("development")
@Configuration
public class ConfigDev {
    @Bean(
            name = "configDev"
    )
    public String configDev() {
        return "This is development configuration";
    }
}
