package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class Main {

    @GetMapping("/info")
    public InfoResponse info() {
        return new InfoResponse("hello", new BigDecimal("1.2400"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
