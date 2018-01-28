package exercises;

import org.junit.*;

public class TestFixtureTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
        System.out.println("After each test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }



    @Test
    public void testMethodA() {
        System.out.println("method A");
    }
    @Test
    public void testMethodB() {
        System.out.println("method B");
    }
}
