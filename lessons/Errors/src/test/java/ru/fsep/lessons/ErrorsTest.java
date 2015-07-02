package ru.fsep.lessons;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created by aspire on 02.07.2015.
 */
public class ErrorsTest {

    private String fileName;
    private Errors errorTest;

    @Before
    public void setUp() throws Exception {
        fileName = "letter.txt";
        errorTest = new Errors(fileName);
    }

    @Test(expected = MyFileNotFoundException.class)
    public void testReadLetterFromFile() throws Exception {
        errorTest.readLetterFromFile();
    }

    @Test(expected = NotUpperLetterException.class)
    public void testGetUpperLetter() throws Exception {
        errorTest.findUpperLetter();
    }
}