import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by ramil on 01.07.2015.
 */
public class StudentsDaoTxtImplementationTest {
    private String file;
    ArrayList<Student> expected;
    ArrayList<Student> actual;
    @Mock
    StudentsDao dao;


    @Before
    public void setUp() throws Exception {
        expected = new ArrayList<Student>();
        actual = new ArrayList<Student>();
        file = "C://students.txt";
        expected.add(new Student("babay", 50, 90, 90));
        expected.add(new Student("malay", 89, 45 , 42));
        //dao = new StudentsDaoTxtImplementation(file);
        dao = mock(StudentsDao.class);


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAll() throws Exception {
        //ArrayList<Student> actual;
        //StudentServiseFacade test = new StudentServiseFacade(new StudentsDaoTxtImplementation(file));
       // actual = test.getAll();
       // assertEquals(expected.get(0), actual.get(0));
    }

    @Test
    public void testMock() throws Exception {
        when(dao.getAll()).thenReturn(actual);
        StudentServiseFacade dao = new StudentServiseFacade(new StudentsDaoTxtImplementation(file));
        actual = dao.getAll();
        assertEquals(actual.get(0), expected.get(0));
        assertEquals(actual.get(1), expected.get(1));
    }

}