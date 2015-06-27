package ru.fsep.lessons.transfer;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TransferTest {

    private Woman testWoman;
    private Man testMan;
    private Transfer testTransfer;

    @Before
    public void setUp() throws Exception {
        testMan = new Man(30,"Alex");
        testWoman = new Woman(67,"Helen");
        testTransfer = new Transfer();
    }

    @Test
    public void testTransManToWoman() throws Exception {
        Class expected = testMan.getClass();
        Man testMan = testTransfer.trans(testWoman);
        Class actual = testMan.getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void testTransWomanToMan() throws Exception {
        Class expected = testWoman.getClass();
        Woman testWoman = testTransfer.trans(testMan);
        Class actual = testWoman.getClass();
        assertEquals(expected,actual);
    }
}