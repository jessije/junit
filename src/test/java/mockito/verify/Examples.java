package mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Examples {
    @Mock
    List<String> mockedList;

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected(){
        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
        assertEquals(0,mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100);
        assertEquals(100,mockedList.size());
    }
}
