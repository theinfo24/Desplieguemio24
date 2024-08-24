package com.example.despliegue.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/name")
    public String getName() {
        return "Bayron Vásquez 2024";
    }
}

