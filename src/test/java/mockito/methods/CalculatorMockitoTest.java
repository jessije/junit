package mockito.methods;

import one.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockitoTest {
    @Mock
    Calculator calculator;

    @Test
    public void TestAddWithPositiveIntegerReturnResult() {
        when(calculator.add(3,5)).thenReturn(8);
    }

    @Test
    public void TestAddWithNegativeInetgerReturnResult() {
        when(calculator.add(-3,-5)).thenReturn(-8);

        //!Important what does it mean?
    }

    @Test
    public void TestAddWithAnyIntegerReturnAny() {
        when(calculator.add(anyInt(), anyInt())).thenReturn(120);
    }
}

