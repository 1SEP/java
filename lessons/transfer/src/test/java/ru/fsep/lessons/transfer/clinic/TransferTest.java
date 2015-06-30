package ru.fsep.lessons.transfer.clinic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.fsep.lessons.transfer.patients.Human;
import ru.fsep.lessons.transfer.patients.Man;
import ru.fsep.lessons.transfer.patients.Woman;

public class TransferTest {

    private Man alex;
    private Woman helen;
    private Human[] massActual;
    private Human[] massExpected;

    @Before
    public void setUp() throws Exception {
        alex = new Man(20,"Alex");
        helen = new Woman(50,"Helen");
        massActual = new Human[2];
        massActual[0] = alex;
        massActual[1] = helen;

        Woman expected = new Woman(20,"Alex");
        Man expected1 = new Man(50,"Helen");
        massExpected = new Human[2];
        massExpected[0] = expected;
        massExpected[1] = expected1;
    }

    @Test
    public void testTransAll() throws Exception {
        Transfer.transAll(massActual);
        Assert.assertArrayEquals(massExpected, massExpected);
    }
}