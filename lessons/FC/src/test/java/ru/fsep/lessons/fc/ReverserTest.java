package ru.fsep.lessons.fc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ramil on 25.06.2015.
 */
public class ReverserTest {
    private  Reverser testingReverser;
    @Before
    public void setUp() throws Exception {
        testingReverser = new Reverser();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testReveser() throws Exception {
        String expected = "ewq";
        String actual = testingReverser.reverser("qwe");
        assertEquals(expected,actual);
    }
}