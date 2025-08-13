package com.khdour;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Named;

/**
 * Unit test for simple App.
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @Named("test")
    public void shouldAnswerWithTrue()
    {
        assertTrue( true,"Should be true" );
    }

    @Test
    public void testPrintHelloWorld() {
        Injector injector = Guice.createInjector(new HelloWorldModule());
        HelloWorldService service = injector.getInstance(HelloWorldService.class);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            service.printHelloWorld();
        } finally {
            System.setOut(originalOut);
        }
        String output = outContent.toString().trim();
        assertTrue(output.contains("Hello, World! from HelloWorldImpl"));
    }
}
