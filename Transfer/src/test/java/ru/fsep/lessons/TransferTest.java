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
        Class actual = testWoman.getClass();
        Class expected = testTransfer.trans(testMan).getClass();
        assertEquals(expected, actual);
    }

    @Test
    public void testTrans1() throws Exception {
        Class actual = testMan.getClass();
        Class expected = testTransfer.trans(testWoman).getClass();
        assertEquals(expected, actual);
    }
}