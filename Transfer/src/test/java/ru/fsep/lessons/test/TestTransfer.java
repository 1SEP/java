package ru.fsep.lessons.test;

import junit.framework.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import ru.fsep.lessons.transfer.Man;
import ru.fsep.lessons.transfer.Transable;
import ru.fsep.lessons.transfer.Transfer;
import ru.fsep.lessons.transfer.Woman;


import org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by Надежда on 26.06.2015.
 */
public class TestTransfer {

    private Woman testingWoman1,testingWoman2;
    private Man testingMan1,testingMan2;
    private Transfer testTransfer;
    private Transable[] testTransables;
    private Transable [] testExpected;

    @Before
    public void setUp() throws Exception{

        testTransfer = new Transfer();
        testingWoman1  = new Woman(25,"Sony");
        testingWoman2 = new Woman(29,"Lily");
        testingMan1 = new Man (35,"Victor");
        testingMan2 = new Man(39,"Villy");
        testTransfer = new Transfer();

        testTransables = new Transable[4];
        testTransables[0] = testingWoman1;
        testTransables[1] = testingWoman2;
        testTransables[2] = testingMan1;
        testTransables[3]= testingMan2;


        testExpected = new Transable[4];
        testExpected[0] = new Woman(testingMan1.getAge(),testingMan1.getName());
        testExpected[1] = new Woman(testingMan2.getAge(),testingMan2.getName());
        testExpected[2] = new Man(testingWoman1.getAge(),testingWoman1.getName());
        testExpected[3] = new Man(testingWoman2.getAge(),testingWoman2.getName());
      }



    @Test
    public void TestTranseAll() throws Exception{

        Transable[]expected = testExpected;

        Transable[] tests = testTransfer.transeAll(testTransables);
        Transable []actual = tests;

        assertArrayEquals(expected,actual);




            }


}
