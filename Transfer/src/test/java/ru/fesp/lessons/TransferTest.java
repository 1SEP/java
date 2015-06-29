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
    private Transfer transferAll;
    private Transable [] testTransables;
    private Transable [] testTransables2;
    @Before
    public void setUp() throws Exception {
        testWoman= new Woman(30, "Oksi");
        testMan = new Man(20 , "Max");
        transfer = new Transfer();
        transferAll = new Transfer();
        testTransables = new Human[2];
        testTransables[0] = new Man(12, "oleg");
        testTransables[1] = new Man(13, "Goga");
        testTransables2 = new Human[2];
        testTransables2[0] = new Woman(22, "olga");
        testTransables2[1] = new Woman(44, "qwerty");
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
    @Test
    public void testTranceAll() throws Exception{
        transferAll.transAll(testTransables);
        Class expected = testTransables.getClass();
        Class actual = testTransables2.getClass();
        assertEquals(expected, actual);
    }
}