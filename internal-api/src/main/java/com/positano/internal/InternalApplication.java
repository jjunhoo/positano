package com.positano.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.positano.core", "com.positano.internal"}) // core, internal module component scan
@EnableMongoRepositories(basePackages = "com.positano.core.mongo.repository")
public class InternalApplication {
    public static void main(String[] args) {
        SpringApplication.run(InternalApplication.class, args);
    }
}
