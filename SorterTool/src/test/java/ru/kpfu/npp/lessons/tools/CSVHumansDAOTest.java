package ru.kpfu.npp.lessons.tools;

import com.google.common.collect.Lists;
import com.sun.deploy.trace.Trace;
import com.sun.org.apache.xml.internal.security.utils.Constants;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CSVHumansDAOTest {

    private HumansDAO humansDAO;
    final String TEST_INPUT_FILE_NAME = "src/test/input_test_data.csv";
    final String TEST_OUTPUT_FILE_NAME = "/src/test/output_test_data.cvs";

    @Before
    public void setUp() throws Exception {
          humansDAO = new CSVHumansDAO();
    }
    @Test
    public void testGetDataFromResourсe() throws Exception
    {
        List <Human> expectedHumans = new ArrayList<Human>();
        Human human1 = new HumanImpl("Petrov", 20);
        Human human2 = new HumanImpl("Sidorov",100);
        Human human3 = new HumanImpl("Dadya",4);
        Human human4 = new HumanImpl("Vasya",90);

//        expectedHumans.add(human1);
//        expectedHumans.add(human2);
//        expectedHumans.add(human3);
//        expectedHumans.add(human4);
// этот метод заменяем байду , что выще

        expectedHumans = Lists.newArrayList(human1, human2, human3, human4);
        File input = new File (TEST_INPUT_FILE_NAME);
        List <Human> actualHumans = humansDAO.getDataFromResourсe(input);
        assertEquals(expectedHumans, actualHumans);

    }

    @Test
    public void testSetDataIntoResource() throws Exception {

    }
}