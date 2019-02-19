package one;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
    public void test() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
//then
        assert result == 8;
       assertEquals(32, 1*2);

    }

    @Test
    public void test1() {
        assertTrue(5<9);
        assertFalse(5<9);
//        assertArrayEquals(, aaray2);
//        assertNull(object);
//        assertSame(object1, object2);
        }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividing() {
        //given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();
        //when
        calculator.divide(number, 0);
        //then
        //should throw exception
    }

    @Test(expected=NullPointerException.class)
    public void testNullPointerException() {
        Object nullObject = null;
        nullObject.equals(new Object());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void ShouldThrowExceptionWhenDividingBy0_2() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/by zero");
        //given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();
        //when
        calculator.divide(number,0);
        //then
        //should throw exception
    }
}
