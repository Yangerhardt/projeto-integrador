package com.example.workit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.workit.controller", "com.example.workit.model", "com.example.workit.service"})
public class WorkitApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkitApplication.class, args);
    }

}
