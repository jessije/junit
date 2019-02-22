package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzerTest {
    @Test
    public void whenNumber1ThenFizzBuzzer1() {
        int input = 1;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "1");
    }

    @Test
    public void whenNumber2ThenFizzBuzzer2() {
        int input = 2;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "2");
    }
    @Test
    public void whenNumber3ThenFizzBuzzerFizz() {
        int input = 3;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "Fizz");
    }
    @Test
    public void whenNumber5ThenFizzBuzzerFizz() {
        int input = 5;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "Buzz");
    }
    @Test
    public void whenNumber6ThenFizzBuzzerFizz() {
        int input = 6;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "Fizz");
    }
    @Test
    public void whenNumber10ThenFizzBuzzerBuzz() {
        int input = 10;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "Buzz");
    }
    @Test
    public void whenNumber15ThenFizzBuzzerFizzBuzz() {
        int input = 15;
        String expected = Fizzbuzzer.getValue(input);
        assertEquals(expected, "FizzBuzz");
    }

    @Test(expected = RuntimeException.class)
    public void whenNumberLessThan1ThenThrowaException() {
        int input=0;
        String expected = Fizzbuzzer.getValue(input);
    }
    @Test(expected = RuntimeException.class)
    public void whenNumberMoreThan100ThenThrowaException() {
        int input=101;
        String expected = Fizzbuzzer.getValue(input);
    }
}