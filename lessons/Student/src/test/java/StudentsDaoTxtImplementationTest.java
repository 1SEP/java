import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by ramil on 01.07.2015.
 */
public class StudentsDaoTxtImplementationTest {
    private String file;
    ArrayList<Student> expected;
    @Before
    public void setUp() throws Exception {
        expected = new ArrayList<Student>();
        file = "C://students.txt";
        expected.add(new Student("babay", 50, 90, 90));
        expected.add(new Student("malay", 89, 45 , 42));

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAll() throws Exception {
        ArrayList<Student> actual;
        StudentServiseFacade test = new StudentServiseFacade(new StudentsDaoTxtImplementation(file));
        actual = test.getAll();
        assertEquals(expected.get(0), actual.get(0));
    }
}