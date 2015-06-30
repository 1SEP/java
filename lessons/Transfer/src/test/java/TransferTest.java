import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ramil on 27.06.2015.
 */
public class TransferTest {
    private  Man testingMan;
    private  Woman testingWoman;
    private  Transfer transfer;
    private Transable test[] = new Transable[5];
    @Before
    public void setUp() throws Exception {
        testingMan = new Man(5,"Terminatot");
        testingWoman = new Woman(8,"Robokopsha");

        test[0]= new Man(5, "mars");
        test[1]= new Woman(10, "katya");
        transfer = new Transfer();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testtransAll() throws Exception {
        Class expected = testingMan.getClass();
        Object actual = test[0].getClass();
        assertEquals(expected, actual);
    }
}