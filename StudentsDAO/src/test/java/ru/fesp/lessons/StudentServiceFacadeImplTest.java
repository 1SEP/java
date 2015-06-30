package ru.fesp.lessons;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Ôëþð on 30.06.2015.
 */
public class StudentServiceFacadeImplTest {
    StudentServiceFacade studentServiceFacade;
    Student expected;
    String name;
    String surname;
    Student actual;
    int point;
    @Before
    public void setUp() throws Exception {
        studentServiceFacade= new StudentServiceFacadeImpl(new StudentsDAOTxtImpl());
        String name = new String("Flyur");
        String surname = new String("Karimov");
        int point = 253;
        expected = new Student(name, surname, point);
    }
    @Test
    public void getAllTest() throws Exception{

        ArrayList<Student> actualStudent = studentServiceFacade.getAll();
        actual = actualStudent.get(0);
        assertEquals(expected, actual);

        name = new String("Goga");
        surname = new String("Gogovna");
        point = 123;
        expected = new Student(name, surname, point);
        actual = actualStudent.get(1);
        assertEquals(expected, actual);

        String name = new String("Nichole");
        String surname = new String("Nikiforovna");
        point = 444;
        expected = new Student(name, surname, point);
        actual = actualStudent.get(2);
        assertEquals(expected, actual);
    }
}