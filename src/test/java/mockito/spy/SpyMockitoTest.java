package mockito.spy;

import one.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class SpyMockitoTest {
    //difference betweeen mock and spy


    @Test
    public void testListAllWithMick() {
        List mockedList = Mockito.mock(ArrayList.class);

        mockedList.add("one");
        Mockito.verify(mockedList).add("one");

        assertEquals(0,mockedList.size());
    }

    @Test
    public void testListAllWithSpy() {
        List spyList = spy(new ArrayList());

        spyList.add("one");
        Mockito.verify(spyList).add("one");

        assertEquals(1,spyList.size());
    }

    @Test
    public void testSpyFirst() {
        Calculator calculator = new Calculator();
        Calculator spyCalculator = spy(calculator);
        spyCalculator.add(4,6);
        spyCalculator.add(3,4);
        Mockito.verify(spyCalculator).add(4,6);
        Mockito.verify(spyCalculator).add(3,4);
    }

    @Test (expected = NullPointerException.class)
    public void testSpyWithMockBehavior() {
        List<String> instance = new ArrayList<>();
        List<String> spy = spy(instance);
        doThrow(NullPointerException.class).when(spy).size();
        spy.size(); // will throw the exception
    }
}
