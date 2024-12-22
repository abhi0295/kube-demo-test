package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(path = "/kube-test")
    public String getMessage() {
        return "Testing kubernetes";
    }

    @GetMapping(path = "/salutation")
    public String saluteUser(@RequestParam String name) {
        return "Hello "+name+", Welcome to kube test application";
    }
}
