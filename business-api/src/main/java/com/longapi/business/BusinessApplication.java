package com.longapi.business;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.longapi"})
@EnableJpaRepositories("com.longapi")
@EntityScan("com.longapi.*")
@SpringBootApplication
public class BusinessApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }


}

