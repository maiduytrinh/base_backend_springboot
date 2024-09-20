package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.app.ultils.FileStorageProperties;

@EnableConfigurationProperties({
        FileStorageProperties.class
})
@SpringBootApplication
public class MainBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainBackendApplication.class, args);
    }

}
