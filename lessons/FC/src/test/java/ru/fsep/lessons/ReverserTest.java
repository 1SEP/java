package ru.fsep.lessons;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ReverserTest {

    private Reverser reverser;

    @Before
    public void setUp() throws Exception {
        reverser = new Reverser();
    }

    @Test
    public void testReverse() throws Exception {
        String actual = reverser.reverse("string");
        String expected = "gnirts";
        assertEquals(expected, actual);
    }
}

 