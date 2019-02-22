package one;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialPositiveIntegerReturnsResult() {
        assertEquals(24, FactorialV.calculateFactorial(5));
    }

    @Test (expected = RuntimeException.class)
    public void whenCalculateFactorialNegativeIntegerThrowsException() {
        FactorialV.calculateFactorial(-1);
    }

    @Test (expected = RuntimeException.class)
    public void name() {
       FactorialV.calculateFactorial(0);
    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialIsBigInteger() {
        FactorialV.calculateFactorial(0);
    }
}