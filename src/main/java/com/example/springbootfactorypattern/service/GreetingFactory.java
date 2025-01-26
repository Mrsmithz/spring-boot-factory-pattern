package com.example.springbootfactorypattern.service;

public interface GreetingFactory <T extends Greeting & Greetable> {

    T getService(String value);
}
