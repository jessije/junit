package tdd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {
    @Test
    public void whenNumber1ThenReturn1() {
        int input = 1;
        int expected = Factorial.getFactorialNumber(input);
        assertEquals(expected, 1);
    }

    @Test
    public void whenNumber2ThenReturn2() {
        int input = 2;
        int expected = Factorial.getFactorialNumber(input);
        assertEquals(expected, 2);
    }

    @Test
    public void whenNumber3ThenReturn6() {
        int input = 3;
        int expected = Factorial.getFactorialNumber(input);
        assertEquals(expected, 6);
    }

    @Test
    public void whenNumber1thenReturn2Map() {
        int input = 1;
        int expected = Factorial.getFactorialNumberWithMap(input);
        assertEquals(expected, 1);

    }

    @Test
    public void whenNumber2thenReturn2Map() {
        int input = 2;
        int expected = Factorial.getFactorialNumberWithMap(input);
        assertEquals(expected, 2);
    }

    @Test
    public void whenNumber3thenReturn6Map() {
        int input = 3;
        int expected = Factorial.getFactorialNumberWithMap(input);
        assertEquals(expected, 6);
    }
}
