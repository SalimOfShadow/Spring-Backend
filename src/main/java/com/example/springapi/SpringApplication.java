package com.example.springapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }

    @GetMapping("hello/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "date", required = false) Optional<String> date) {
        String currentDate = date.orElse(LocalDate.now().toString());

        return String.format("Hello %s! It is currently %s.", name, currentDate);
    }
}