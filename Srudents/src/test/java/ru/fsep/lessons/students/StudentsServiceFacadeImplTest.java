package ru.fsep.lessons.students;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert;

public class StudentsServiceFacadeImplTest {

    private String fileNameTest;
    private StudentsDaoTxtImpl studentsDaoTxtTest;
    private StudentsServiceFacadeImpl serviceFacadeImplTest;
    private Student expectedStudent;
    private ArrayList<Student> actualListOfStudents;
    private Student actualStudent;

    @Before
    public void setUp() throws Exception {
        fileNameTest = "studentsData.txt";
        studentsDaoTxtTest = new StudentsDaoTxtImpl(fileNameTest);
        serviceFacadeImplTest = new StudentsServiceFacadeImpl(studentsDaoTxtTest);
        expectedStudent = new Student("Almakayev", "Ildar", 50);
    }

    @Test
    public void testGetAll() throws Exception {
        actualListOfStudents = serviceFacadeImplTest.getAll();
        actualStudent = actualListOfStudents.get(0);
        Assert.assertEquals(expectedStudent, actualStudent);
    }
}