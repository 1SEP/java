package ru.fesp.lessons;

import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;

/**
 * Created by ���� on 29.06.2015.
 */
public class HumanTest {
    Human human;
    @Before
    public void setUp() throws Exception {
        human = new Human(12, "alala");
    }

    @Test(expected = NotImplementedException.class)
    public void testTrans() throws Exception {
        human.trans();
    }
}