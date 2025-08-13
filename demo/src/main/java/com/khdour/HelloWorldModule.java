package com.khdour;

import com.google.inject.AbstractModule;

public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloWorld.class).to(HelloWorldImpl.class);
    }
    
}
