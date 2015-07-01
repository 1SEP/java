package ru.fsep.lessons.students;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentsServiceFacadeImplTest {

    private  final String fileName = "studentsData.txt";
    private StudentsDao dao;
    private ArrayList<Student> expected;

    @Before
    public void setUp(){
        expected = new ArrayList<Student>();
        expected.add(new Student("Almakayev", "Ildar", 50));
        expected.add(new Student("Tiglev", "Semen", 50));
        expected.add(new Student("Fedorov", "Yura", 50));

        dao = mock(StudentsDao.class);
        when(dao.getAll()).thenReturn(expected);
    }

    @Test
    public void testGetAll() throws Exception {
        StudentsServiceFacadeImpl facade = new StudentsServiceFacadeImpl(new StudentsDaoTxtImpl(fileName));
        ArrayList<Student> actual = facade.getAll();
        Assert.assertEquals(expected, actual);
    }
}