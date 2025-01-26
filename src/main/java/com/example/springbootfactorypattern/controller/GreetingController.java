package com.example.springbootfactorypattern.controller;

import com.example.springbootfactorypattern.model.GreetingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface GreetingController {

    @PostMapping("/greet")
    ResponseEntity<String> greet(@RequestBody GreetingRequest request);
}
