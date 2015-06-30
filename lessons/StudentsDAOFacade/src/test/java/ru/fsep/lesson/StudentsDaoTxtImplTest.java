package ru.fsep.lesson;

import ru.fsep.lesson.interfaces.StudentsServiceFacade;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class StudentsDaoTxtImplTest {

    ArrayList<Student> expected;

    @org.junit.Before
    public void setUp() throws Exception {

        expected = new ArrayList<Student>();
        expected.add(new Student("Ivanov", "Ivan", 99));
        expected.add(new Student("Matveeva", "Nady", 100));
        expected.add(new Student("Fedorov", "Juriy", 90));
    }

    @org.junit.Test
    public void testGetAll() throws Exception {
        ArrayList<Student> actual;

        StudentsServiceFacade studentsServiceFacade = new StudentsServiceTxtImpl(new StudentsDaoTxtImpl());
        actual = studentsServiceFacade.getAll();

        assertEquals(expected.get(0), actual.get(0));
        assertEquals(expected.get(1), actual.get(1));
        assertEquals(expected.get(2), actual.get(2));
    }
}