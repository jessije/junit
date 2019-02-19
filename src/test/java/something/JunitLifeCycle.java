package something;

import org.junit.*;

public class JunitLifeCycle {
    //

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("run after each test");

    }

    @BeforeClass
    public static void setUpBeforClass()  {
        System.out.println("run before the first test method");

    }

    @AfterClass
    public static void tearDownBeforeClass()  {
        System.out.println("run after the last test method");

    }

    @Test
    public void name() {
    }
}
