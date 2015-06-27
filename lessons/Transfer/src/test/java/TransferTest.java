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
    @Before
    public void setUp() throws Exception {
        testingMan = new Man(5,"test");
        testingWoman = new Woman(8,"test1");
        transfer = new Transfer();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTransfer() throws Exception {
        Class expected = testingWoman.getClass();
        Class actual = transfer.transfer(testingMan).getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void testTransfer1() throws Exception {
    Class expected = testingMan.getClass();
        Class actual = transfer.transfer(testingWoman).getClass();
        assertEquals(expected, actual);
    }
}