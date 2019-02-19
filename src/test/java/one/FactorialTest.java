package one;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialPositiveIntegerReturnsResult() {
        assertEquals(24, Factorial.calculateFactorial(5));
    }

    @Test (expected = RuntimeException.class)
    public void whenCalculateFactorialNegativeIntegerThrowsException() {
        Factorial.calculateFactorial(-1);
    }

    @Test (expected = RuntimeException.class)
    public void name() {
       Factorial.calculateFactorial(0);
    }

}