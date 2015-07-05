package ru.fsep.lessons.errors;

import org.junit.Before;
import org.junit.Test;
import ru.fsep.lessons.errors.Exceptions.FileIsEmptyException;
import ru.fsep.lessons.errors.Exceptions.NoUpperLettersException;

public class ErrorsTest {

    Errors errors;
    String pathToFile;

    @Before
    public void setUp() throws Exception {
        pathToFile = "C:\\Users\\pc1\\IdeaProjects\\Maven\\Errors\\src\\main\\resources\\text.txt";
        errors = new Errors(pathToFile);
    }

    @Test(expected = FileIsEmptyException.class)
    public void testReadFile() throws Exception {
        errors.readFile();
    }

    @Test(expected = NoUpperLettersException.class)
    public void testCheckLetters() throws Exception {
        errors.checkLetters();
    }
}