package com.sxl.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.sxl.learn.repository")
@EntityScan("com.sxl.learn.entity")
@SpringBootApplication
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
