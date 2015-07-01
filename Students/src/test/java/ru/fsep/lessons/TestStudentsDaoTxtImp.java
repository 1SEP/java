package ru.fsep.lessons;


import org.junit.Before;
import org.junit.Test;
import ru.fsep.lessons.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * Created by Надежда on 30.06.2015.
 */
public class TestStudentsDaoTxtImp {

    ArrayList<Students> expected;
    StudentsDao dao;


    @Before
    public void setUp() throws Exception{

        expected = new ArrayList<Students>();
        expected.add(0,new Students("Lapin", "Sergei", 300));
        expected.add(1,new Students("Noskova", "Nataly", 231));
        expected.add(2,new Students("Vinichenko", "Lena", 249));
    }

    @Mock
    public  void setDao() throws Exception{
        dao = (StudentsDao) mock(StudentsDao.class);
        when(dao.getAll()).thenReturn(expected);
    }


    @Test
    public void  testGetAll() throws FileNotFoundException {
        ArrayList<Students> actual;
        StudentDaoTxtImp ar = new StudentDaoTxtImp();
        StudentsServiceFacadeImp student= new StudentsServiceFacadeImp(ar);
        actual = student.getAll();

        assertEquals(expected.get(0),actual.get(0));
        assertEquals(expected.get(1),actual.get(1));
        assertEquals(expected.get(2),actual.get(2));
    }
}
