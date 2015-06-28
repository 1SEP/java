package ru.fsep.lesson;

import org.junit.Test;
import org.junit.Before;
import ru.fsep.lesson.humans.Man;
import ru.fsep.lesson.humans.Women;
import ru.fsep.lesson.transfer.Transfer;

import static junit.framework.TestCase.assertEquals;


public class TransferTest {

    private Man man;
    private Women women;

    @Before
    public void setUpManToWomen() throws Exception {
        man = new Man("Bob", 31);
    }

    @Test
    public void testTransferManToWomen() throws Exception {

        Women expected = new Women("Bob", 31);
        Women actual = Transfer.transfer(man);

        assertEquals (expected, actual);
    }

    @Before
    public void setUpWomenToMan() throws Exception {
        women = new Women("Anna", 40);
    }

    @Test
    public void testTransferWomenToMan() throws Exception {

        Man expected = new Man("Anna", 40);
        Man actual = Transfer.transfer(women);

        assertEquals(expected, actual);
    }
}