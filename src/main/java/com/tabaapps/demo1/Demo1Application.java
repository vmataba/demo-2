package com.tabaapps.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

    @GetMapping
    public String showIndexPage() {
        return ("<h1 style='width: 100%; text-align:center'>Welcome to Demo App in Java</h1>");
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
