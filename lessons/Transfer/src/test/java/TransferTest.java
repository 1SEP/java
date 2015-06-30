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
    private Transable test[] = new Transable[2];
    private Transable test_new[] = new Transable[2];
    @Before
    public void setUp() throws Exception {

        test[0]= new Man(5, "mars");
        test[1]= new Woman(10, "katya");
        transfer = new Transfer();
        transfer.transAll(test);
        test_new[0] = new Woman(5, "mars");
        test_new[1] = new Man(10, "katya");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testtransAll() throws Exception {
        for(int i = 0; i < test.length; i++) {
            Class expected = test[i].getClass();
            Class actual = test_new[i].getClass();
            assertEquals(expected, actual);
        }
    }


}