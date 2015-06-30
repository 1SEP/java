package ru.fsep.lessons.students;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert;

public class StudentsServiceFacadeImplTest {

    private String fileNameTest;
    private StudentsDaoTxtImpl studentsDaoTxtTest;
    private StudentsServiceFacadeImpl serviceFacadeImplTest;
    private ArrayList<Student> expectedListOfStudents;
    private ArrayList<Student> actualListOfStudents;

    @Before
    public void setUp() throws Exception {
        fileNameTest = "studentsData.txt";
        studentsDaoTxtTest = new StudentsDaoTxtImpl(fileNameTest);
        serviceFacadeImplTest = new StudentsServiceFacadeImpl(studentsDaoTxtTest);
        expectedListOfStudents = new ArrayList<Student>();

        expectedListOfStudents.add(new Student("Almakayev", "Ildar", 50));
        expectedListOfStudents.add(new Student("Tiglev", "Semen", 50));
        expectedListOfStudents.add(new Student("Fedorov", "Yura", 50));
    }

    @Test
    public void testGetAll() throws Exception {
        actualListOfStudents = serviceFacadeImplTest.getAll();
        Assert.assertEquals(expectedListOfStudents, actualListOfStudents);

    }
}