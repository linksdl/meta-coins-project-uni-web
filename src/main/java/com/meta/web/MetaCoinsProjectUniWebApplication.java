package com.meta.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan(basePackages = {"com.meta.web.***.***.entity"})
@EnableSwagger2
public class MetaCoinsProjectUniWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetaCoinsProjectUniWebApplication.class, args);
    }

}
