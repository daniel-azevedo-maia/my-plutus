package com.daniel_azevedo.my_plutus.core.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DotenvConfig {

    @Autowired
    private ConfigurableEnvironment environment;

    @PostConstruct
    public void loadDotenv() {
        Dotenv dotenv = Dotenv.load();
        Map<String, Object> envMap = new HashMap<>();

        dotenv.entries().forEach(entry -> {
            envMap.put(entry.getKey(), entry.getValue());
            System.out.println("Loading env var: " + entry.getKey() + " = " + entry.getValue());
        });

        environment.getPropertySources().addFirst(new MapPropertySource("dotenvProperties", envMap));
    }
}
