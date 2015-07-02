package ru.fesp.lessons;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import ru.fesp.exceptions.NotUpperLetter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ôëþð on 02.07.2015.
 */
public class ErrorTestFindLetterExeption extends TestCase {
    Error error;
    ArrayList<Character> bigLetters;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        bigLetters = new ArrayList<Character>();
        error = new Error();
        error.read();
        testFindLetter();
    }
    @Test(expected = NotUpperLetter.class)
    public void testFindLetter() throws Exception {
        error.findLetter();
        bigLetters = error.getBigLetters();
    }
}