package ru.fesp.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ôëþð on 29.06.2015.
 */
public class HumanTest {
    Human human;
    @Before
    public void setUp() throws Exception {
        human = new Human(12, "alala");
    }

    @Test
    public void testTrans() throws Exception {
        human.trans();
    }
}