package ru.fsep.lesson;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import ru.fsep.lesson.interfaces.StudentsDAO;
import ru.fsep.lesson.interfaces.StudentsServiceFacade;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StudentsDaoTxtImplTest {

    private ArrayList<Student> expected;
    private StudentsDAO dao;

    @Before
    public void setUp() throws Exception {

        expected = new ArrayList<Student>();
        expected.add(new Student("Ivanov", "Ivan", 99));
        expected.add(new Student("Matveeva", "Nady", 100));
        expected.add(new Student("Fedorov", "Juriy", 90));

        dao = mock(StudentsDAO.class);
        when(dao.getAll()).thenReturn(expected);
    }

    @Test
    public void testGetAll() throws Exception {


        StudentsServiceFacade facade = new StudentsServiceTxtImpl(dao);
        ArrayList<Student> actual = facade.getAll();

        assertEquals(expected.get(0), actual.get(0));
        assertEquals(expected.get(1), actual.get(1));
        assertEquals(expected.get(2), actual.get(2));
    }
}


//ArrayList<Student> actual;
//
//StudentsServiceFacade studentsServiceFacade = new StudentsServiceTxtImpl(new StudentsDaoTxtImpl());
//actual = studentsServiceFacade.getAll();
//
//        assertEquals(expected.get(0), actual.get(0));
//        assertEquals(expected.get(1), actual.get(1));
//        assertEquals(expected.get(2), actual.get(2));