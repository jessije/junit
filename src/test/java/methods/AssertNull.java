package methods;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class AssertNull {
    @Test
    public void whenAssertNullthenNull() {
        Object object = null;
        assertNull(object);
    }
}
