package com.example.springnuvemofc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringNuvemOfcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNuvemOfcApplication.class, args);
    }

    @GetMapping("/")
    public String deuCerto(){
        return "Nikinho 1234";
    }
}
