package ru.fsep.lessons.transfer;

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
    public void testTransManToWoman() throws Exception {
        Class expected = testWoman.getClass();
        Woman actualWoman = testTransfer.trans(testMan);
        Class actual = actualWoman.getClass();
        assertEquals(expected, actual);
    }

    @Test
    public void testTransWomanToMan() throws Exception {
        Class expected = testMan.getClass();
        Man actualMan = testTransfer.trans(testWoman);
        Class actual = actualMan.getClass();
        assertEquals(expected, actual);
    }
}