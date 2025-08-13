package com.khdour;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

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
}
