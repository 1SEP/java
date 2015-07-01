import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Rauf on 01.07.2015.
 */

public class StudentsServiceFacadeImplTest {

    private StudentsDao studentsDao;
    private ArrayList<Student> expectedListOfStudents;
    private ArrayList<Student> actualListOfStudents;
    private int actual;
    private int expected;

    @Before
    public void setUp() throws Exception {

        expectedListOfStudents = new ArrayList<Student>();
        expectedListOfStudents.add(new Student("Yagfarov", "Rauf", 100));
        expectedListOfStudents.add(new Student("Yagfarov2", "Rauf2", 100));
        expectedListOfStudents.add(new Student("Tukhvatov", "Rustam", 100));

        studentsDao = mock(StudentsDao.class);
        when(studentsDao.getAll()).thenReturn(expectedListOfStudents);
    }


    @Test
    public void testGetAll() throws Exception {

        actualListOfStudents = studentsDao.getAll();
        Assert.assertEquals(expectedListOfStudents, actualListOfStudents);
    }

    @Test
    public void testGetAveragedPoint() throws Exception {
        StudentsServiceFacadeImpl studentsServiceFacade = new StudentsServiceFacadeImpl(studentsDao);
        actual=studentsServiceFacade.getAveragedPoint();
        expected=100;
        Assert.assertEquals(actual,expected);
    }
}