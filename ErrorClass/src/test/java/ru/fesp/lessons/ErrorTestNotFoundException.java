package ru.fesp.lessons;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ôëþð on 02.07.2015.
 */
public class ErrorTestNotFoundException extends TestCase {
    Error error;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        error = new Error();
    }
    @Test(expected = FileNotFoundException.class)
    public void testRead() throws Exception {
        error.read();
    }
}