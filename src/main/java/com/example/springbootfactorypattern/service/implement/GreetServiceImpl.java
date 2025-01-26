package com.example.springbootfactorypattern.service.implement;

import com.example.springbootfactorypattern.service.GreetService;
import com.example.springbootfactorypattern.service.Greeting;
import com.example.springbootfactorypattern.service.GreetingFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GreetServiceImpl implements GreetService {

    private final GreetingFactory<? extends Greeting> greetingFactory;

    @Override
    public String greet(String value) {
        Greeting greeting = greetingFactory.getService(value);

        return greeting.greet();
    }
}
