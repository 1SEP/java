package ru.fsep.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aspire on 25.06.2015.
 */
public class ReverserTest {
    private Reverser testReverser;

    @Before
    public void setUp() throws Exception {
        testReverser = new Reverser();
    }

    @Test
    public void testReverse() throws Exception {
        String expected = "radli";
        String actual = testReverser.reverse("ildar");
        assertEquals(expected, actual);
    }
}