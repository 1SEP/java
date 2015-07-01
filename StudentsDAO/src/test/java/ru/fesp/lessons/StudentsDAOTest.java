package ru.fesp.lessons;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ôëþð on 01.07.2015.
 */
public class StudentsDAOTest {
    StudentsDAO dao;
    ArrayList<Student> expectedStudents;
    ArrayList<Student> actualStudents;
    @Before
    public void setUp() throws Exception {
        dao = new StudentsDAOTxtImpl();
        dao = mock(StudentsDAOTxtImpl.class);
        expectedStudents = new ArrayList<Student>();
        actualStudents = new ArrayList<Student>();
        expectedStudents.add(0, new Student("Flyur", "Karimov", 253));
        expectedStudents.add(1, new Student("Goga", "Gogovna", 123));
        expectedStudents.add(2, new Student("Nichole", "Nikiforovna", 444));
        expectedStudents.add(3, new Student("Samuel", "Jackson", 200));
    }
    @Test
    public void getAllTest() throws Exception{
        when(dao.getAll()).thenReturn(expectedStudents);
        actualStudents = dao.getAll();
        assertEquals(expectedStudents.get(0), actualStudents.get(0));
        assertEquals(expectedStudents.get(1), actualStudents.get(1));
        assertEquals(expectedStudents.get(2), actualStudents.get(2));
    }
}