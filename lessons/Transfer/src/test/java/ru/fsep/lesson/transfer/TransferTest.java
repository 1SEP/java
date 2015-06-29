package ru.fsep.lesson.transfer;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import ru.fsep.lesson.Transeble;
import ru.fsep.lesson.humans.Human;
import ru.fsep.lesson.humans.Man;
import ru.fsep.lesson.humans.Women;

import static junit.framework.TestCase.assertEquals;


public class TransferTest {

    private Man man;
    private Women women;
    private Human arrActual[];

    @Before
    public void setUp() throws Exception {
        man = new Man("Bob", 31);
        women = new Women("Anna", 40);
          arrActual = new Human[2];

          arrActual[0] = man;
          arrActual[1] = women;
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
        Women expected0 = new Women("Bob", 31);
        Man expected1 = new Man("Anna", 40);
        Human[] arrExpected = new Human[2];
        arrExpected[0] = expected0;
        arrExpected[1] = expected1;

        Transfer.transferAll(arrActual);

        assertEquals(arrExpected[0], arrActual[0]);
        assertEquals(arrExpected[1], arrActual[1]);
    }
}