package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CibusFoodAppController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
