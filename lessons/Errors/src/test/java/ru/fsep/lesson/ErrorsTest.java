package ru.fsep.lesson;


import org.junit.Before;
import org.junit.Test;
import ru.fsep.lesson.epception.NotUpperLetterException;

import static junit.framework.TestCase.assertEquals;

public class ErrorsTest {

    Errors errors;

    @Before
    public void setUp() throws Exception {
        errors = new Errors();
    }

    @Test
    public void testReadString() {

        String expected = errors.readString("C:\\users\\user\\Git\\java\\lessons\\Errors\\src\\main\\resources\\string.txt");
        String actual = "hello world";

        assertEquals(expected, actual);
    }

    @Test(expected = NotUpperLetterException.class)
    public void testUpperLetter() throws Exception{

        errors.upperLetter("hello world");
        //assertEquals(expected, actual);
    }
}