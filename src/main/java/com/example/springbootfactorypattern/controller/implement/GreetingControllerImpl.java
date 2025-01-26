package com.example.springbootfactorypattern.controller.implement;

import com.example.springbootfactorypattern.controller.GreetingController;
import com.example.springbootfactorypattern.model.GreetingRequest;
import com.example.springbootfactorypattern.service.GreetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class GreetingControllerImpl implements GreetingController {

    private final GreetService greetService;

    @Override
    public ResponseEntity<String> greet(GreetingRequest request) {
        return ResponseEntity
                .ok(greetService.greet(request.getGreet()));
    }
}
