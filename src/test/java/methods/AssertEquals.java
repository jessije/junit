package methods;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertEquals {

    @Test
    public void whenAssertStringEquality_thenEqual() {
        String expected = "feride";
        String actual = new String("eride");

        assertNotEquals(expected,actual);


    }
    @Test
    public void shouldAssertEqualsPass() {
        assertEquals(64,2*32);
    }

    @Test
    public void whenAssertEqualsAssertionWithComment() {
        assertEquals("values are not equal",1,2);
    }
}
