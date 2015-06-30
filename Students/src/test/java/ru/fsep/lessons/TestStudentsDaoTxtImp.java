package ru.fsep.lessons;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 *
 * Created by Надежда on 30.06.2015.
 */
public class TestStudentsDaoTxtImp {

    ArrayList<Students> expected;

    @Before
    public void setUp() throws Exception{

        expected = new ArrayList<Students>();
        expected.add(new Students("Лапин", "Сергей", 300));
        expected.add(new Students("Носкова", "Наталья", 231));
        expected.add(new Students("Виниченко", "Елена", 249));
    }

    @Test
    public void  testGetAll()throws Exception{
        ArrayList<Students> actual;
        StudentDaoTxtImp ar = new StudentDaoTxtImp();
        StudentsServiceFacadeImp student= new StudentsServiceFacadeImp(ar);
        actual = student.getAll();

        assertEquals(expected.get(0),actual.get(0));
        assertEquals(expected.get(1),actual.get(1));
        assertEquals(expected.get(2),actual.get(2));
    }
}
