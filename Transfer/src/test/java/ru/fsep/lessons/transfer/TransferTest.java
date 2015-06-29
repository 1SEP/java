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
    Transable []testTransables;

    @Before
    public void setUp() throws Exception {
        testTransfer = new Transfer();

        testMan = new Man(22, "Ildar");
        testWoman = new Woman(22, "Masha");

        testTransables = new Transable[2];
        testTransables[0] = testMan;
        testTransables[1] = testWoman;
    }

    @Test
    public void testTransAll() throws Exception {
        Transable []expected = new Transable[2];
        expected[0] = new Woman(testMan.getAge(), testMan.getName());
        expected[1] = new Man(testWoman.getAge(), testWoman.getName());

        testTransfer.transAll(testTransables);
        Transable []actual = testTransables;

        assertArrayEquals(expected, actual);
    }
}