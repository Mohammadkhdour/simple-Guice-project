package com.khdour;

import jakarta.inject.Inject;

public class HelloWorldService {
    private final HelloWorld helloWorld;

    @Inject
    public HelloWorldService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void printHelloWorld() {
        helloWorld.sayHello();
    }
}
