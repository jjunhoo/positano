package com.positano.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.positano.core", "com.positano.repository", "com.positano.internal"}) // core, repository, internal module component scan
@EnableMongoRepositories(basePackages = "com.positano.repository.mongo.repository")
@EnableJpaRepositories(basePackages = "com.positano.repository.mysql.repository")
@EntityScan(basePackages = "com.positano.repository.mysql.entity")
public class InternalApplication {
    public static void main(String[] args) {
        SpringApplication.run(InternalApplication.class, args);
    }
}
