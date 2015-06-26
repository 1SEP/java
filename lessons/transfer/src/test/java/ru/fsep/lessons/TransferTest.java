package ru.fsep.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TransferTest {

    @Before
    public void SetUp(){
        Transfer transfer = new Transfer();
    }
    @Test
    public void testTrans() throws Exception {
        Woman helen = new Woman(67, "Helen");
        Man expected = new Man(67, "Helen");
        Man result = Transfer.trans(helen);
        assertTrue(expected.getClass().equals(result.getClass()));
    }

    @Test
    public void testTrans1() throws Exception {

    }
}