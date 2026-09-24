package com.library.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("production")
@Configuration
public class ConfigProd {
    @Bean(
            name = "configProd"
    )
    public String configProd() {
        return "This is production configuration";
    }
}
