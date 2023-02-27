package com.spring.springDto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.spring.springDto.model"})  // scan JPA entities
public class SpringDtoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDtoApplication.class, args);
    }

}
