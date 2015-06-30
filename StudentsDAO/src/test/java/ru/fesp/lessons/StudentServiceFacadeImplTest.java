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
    Student expectedStudent;

    @Before
    public void setUp() throws Exception {
        studentServiceFacade= new StudentServiceFacadeImpl(new StudentsDAOTxtImpl());
        String name = new String("Flyur");
        String surname = new String("Karimov");
        int point = 253;
        expectedStudent = new Student(name, surname, point);
    }
    @Test
    public void getAllTest() throws Exception{

        ArrayList<Student> actualStudent = studentServiceFacade.getAll();
        assertEquals(expectedStudent, actualStudent.get(0));
    }
}