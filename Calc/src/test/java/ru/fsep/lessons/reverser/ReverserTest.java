package ru.fsep.lessons.reverser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Надежда on 24.06.2015.
 */
public class ReverserTest {


    private Reverser testingReverser;

    @Before
    public void setUp() throws Exception {
        testingReverser =new Reverser();

    }

    @Test
    public void testSum() throws Exception {

        String actual = testingReverser.reverse("Nadezda");
        String expected = "adzedaN";
        assertEquals(expected,actual);
    }

}