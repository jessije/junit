package methods;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTrue {
    @Test
    public void shouldAssertTrueThrowAssertionError() {
        assertFalse(5==8);
    }

    @Test
    public void ShouldAssertTruePass() {
        assertTrue(2==2);
        assertTrue("my name".equals(new String("my name")));
    }
}
