import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Rauf on 02.07.2015.
 */
public class ErrorsTest {

    String filename;
    Errors errors;
    String expected;
    String actual;
    boolean actualBool;
    boolean expectedBool;

    @Before
    public void setUp() throws Exception {
        filename = "new.txt";
        errors = new Errors(filename);
        actual="";
        expected="Hello World!";
        expectedBool = true;
    }

    @Test//(expected = MyFileNotFoundException.class )
    public void testRead() throws Exception {
        actual=errors.read();
    }

    @Test//(expected = NotUppercaseException.class)
    public void testIsUpper() throws Exception {
        errors.read();
        actualBool = errors.isUpper();
        Assert.assertEquals(actualBool,expectedBool);
    }
}