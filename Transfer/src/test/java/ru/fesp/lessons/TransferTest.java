package ru.fesp.lessons;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class TransferTest {

    private Woman testWoman;
    private Man testMan;
    private Transfer transfer;
    @Before
    public void setUp() throws Exception {
        testWoman= new Woman(30, "Oksi");
        testMan = new Man(20 , "Max");
        transfer = new Transfer();
    }

    @Test
    public void testTransToMan() throws Exception {
        Class expected = transfer.trans(testWoman).getClass();
        Class actual = testMan.getClass();
        assertEquals(expected, actual);
    }

    @Test
    public void testTransToWoman() throws Exception {
        Class expected = transfer.trans(testMan).getClass();
        Class actual = testWoman.getClass();
        assertEquals(expected, actual);
    }
}