package ru.fsep.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aspire on 26.06.2015.
 */
public class TransferTest {
    private Woman testWoman;
    private Man testMan;
    private Transfer testTransfer;

    @Before
    public void setUp() throws Exception {
        testWoman = new Woman(70, "Masha");
        testMan = new Man(20, "Ildar");
        testTransfer = new Transfer();
    }

    @Test
    public void testTrans() throws Exception {
        //testing Woman class object
        Class expected = testWoman.getClass();
        Woman actualWoman = testTransfer.trans(testMan);
        Class actual = actualWoman.getClass();
        assertEquals(expected, actual);
    }

    @Test
    public void testTrans1() throws Exception {
        //testing Man class object
        Class expected = testMan.getClass();
        Man actualMan = testTransfer.trans(testWoman);
        Class actual = actualMan.getClass();
        assertEquals(expected, actual);
    }
}