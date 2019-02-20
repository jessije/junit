package mockito.verify;

import one.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class verifyMockitoTest {
    @Mock
    Calculator calculator;

    @Test
    public void testAddVerify() {
        calculator.add(anyInt(), anyInt());
        verify(calculator).add(anyInt(), anyInt());
    }

    @Test
    public void testAddVerifyTimes() {
        calculator.add(anyInt(), anyInt());
        verify(calculator, times(1)).add(anyInt(), anyInt());
    }

    @Test
    public void testVerifyWithList() {
        List<String> mockedList= mock(ArrayList.class);
        mockedList.size();
        verify(mockedList).size();
    }

    @Test
    public void testVerifyWithZeroInteractions() {
        List<String> mockedList = mock(ArrayList.class);
        verifyZeroInteractions(mockedList);
        verify(mockedList, times(0)).size();
    }
//will throw and exception because we have one more ucheckd interaction
    @Test
    public void testVerifyWithUnexpectedInteractions() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        mockedList.clear();
        verify(mockedList).size();
        verifyNoMoreInteractions(mockedList);
    }


    @Test
    public void testVerifyOrderedCalls() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        mockedList.add("param");
        mockedList.clear();

        InOrder inOrder = Mockito.inOrder(mockedList);
        inOrder.verify(mockedList).size();
        inOrder.verify(mockedList).add("param");
        inOrder.verify(mockedList).clear();

    }

    @Test
    public void testVerifyNoInteraction() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        verify(mockedList, never()).clear();
    }

    @Test
    public void testVerifyAtLeastAtMost() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.clear();
        mockedList.clear();
        mockedList.clear();

        verify(mockedList, atLeast(1)).clear();
        verify(mockedList, atMost(10)).clear();
    }
}
