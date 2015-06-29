package ru.fsep.lesson.transfer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import ru.fsep.lesson.humans.*;
import static org.junit.Assert.*;


public class TransferTest {

    private Man man;
    private Women women;
    private Human arrActual[];
    private Human[] arrExpected;

    @Before
    public void setUp() throws Exception {
        man = new Man("Bob", 31);
        women = new Women("Anna", 40);
        arrActual = new Human[2];
        arrActual[0] = man;
        arrActual[1] = women;

        Women expected0 = new Women("Bob", 31);
        Man expected1 = new Man("Anna", 40);
        arrExpected = new Human[2];
        arrExpected[0] = expected0;
        arrExpected[1] = expected1;
    }

    @Test
    public void testTransferManToWomen() throws Exception {

        Women expected = new Women("Bob", 31);
        Women actual = Transfer.transfer(man);

        assertEquals (expected, actual);
    }

    @Test
    public void testTransferWomenToMan() throws Exception {

        Man expected = new Man("Anna", 40);
        Man actual = Transfer.transfer(women);

        assertEquals(expected, actual);
    }

    @Test
    public void testTransferAll(){
        Transfer.transferAll(arrActual);

        Assert.assertArrayEquals(arrExpected, arrActual);
    }
}