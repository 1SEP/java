import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ramil on 03.07.2015.
 */
public class ErrorsTest {
    Errors test;
    @Before
    public void setUp() throws Exception {
        test = new Errors("C://test.txt");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = MyException.class)
    public void testSearch() throws Exception {
       test.Search();
    }
}