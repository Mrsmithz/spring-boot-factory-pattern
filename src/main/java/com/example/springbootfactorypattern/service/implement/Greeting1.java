package com.example.springbootfactorypattern.service.implement;

import com.example.springbootfactorypattern.service.Greetable;
import com.example.springbootfactorypattern.service.Greeting;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Greeting1 implements Greeting, Greetable {

    @Override
    public boolean isGreetable(String value) {
        return "greeting1".equals(value);
    }

    @Override
    public String greet() {
        return "Greeting from Greeting1";
    }
}
