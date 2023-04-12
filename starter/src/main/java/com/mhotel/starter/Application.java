package com.mhotel.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.mhotel")
@EntityScan(basePackages = "com.mhotel.dao.model")
//@ComponentScan("com.mhotel")
@EnableJpaRepositories(basePackages = "com.mhotel")
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
