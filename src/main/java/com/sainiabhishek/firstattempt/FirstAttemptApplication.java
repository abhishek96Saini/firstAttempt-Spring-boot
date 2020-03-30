package com.sainiabhishek.firstattempt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //application launched from this class
@RestController // web requests will be handled by this class
public class FirstAttemptApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstAttemptApplication.class, args); // run Spring Application
    }

    @GetMapping("/hello") // hello() method will handle requests when in http://localhost:8080/hello address
    // RequestParam will accept a parameter as 'name', pass it to `String name`. defaultValue provided to prevent problems
    public String hello(@RequestParam(value = "name", defaultValue = "Abhishek") String name) {
        return String.format("Hello %s.", name);
    }
}


