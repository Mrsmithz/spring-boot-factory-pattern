package com.example.springbootfactorypattern.service.implement;

import com.example.springbootfactorypattern.service.Greetable;
import com.example.springbootfactorypattern.service.Greeting;
import com.example.springbootfactorypattern.service.GreetingFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class GreetingFactoryImpl<T extends Greeting & Greetable> implements GreetingFactory<T> {

    private final List<T> greetings;

    @Override
    public T getService(String value) {
        return greetings
                .stream()
                .filter(greet -> greet.isGreetable(value))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("cannot find Greeting for " + value));
    }
}
