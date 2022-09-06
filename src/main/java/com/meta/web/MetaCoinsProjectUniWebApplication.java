package com.meta.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.meta.web.demo.controller")
public class MetaCoinsProjectUniWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetaCoinsProjectUniWebApplication.class, args);
    }

}
