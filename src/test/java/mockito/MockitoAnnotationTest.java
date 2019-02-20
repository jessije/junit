package mockito;

import one.Calculator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {
    // if we want a calss run with mockito, we need to use
    //@RunWith annotation

    @Mock
    Calculator calculator;
    Calculator calculator2 = mock(Calculator.class);

    @Before
    public void init()  {
        MockitoAnnotations.initMocks(this);

    }


}
