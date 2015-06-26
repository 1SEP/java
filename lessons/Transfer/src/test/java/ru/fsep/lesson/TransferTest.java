package ru.fsep.lesson;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import org.junit.Before;


public class TransferTest {

    private Man man;
    private Women women;

    public void assertEquals(Human expected, Human actual){
        if (!expected.equals(actual)){
            throw new AssertionFailedError();
        }
    }

    @Before
    public void setUpOne() throws Exception {
        man = new Man("Bob", 31);
    }

    @Test
    public void testTransfer() throws Exception {

        Women expected = new Women("Bob", 31);
        Women actual = Transfer.transfer(man);

        assertEquals(expected, actual);
    }

    @Before
    public void setUpTwo() throws Exception {
        women = new Women("Anna", 40);
    }

    @Test
    public void testTransfer1() throws Exception {

        Man expected = new Man("Anna", 40);
        Man actual = Transfer.transfer(women);

        assertEquals(expected, actual);
    }
}