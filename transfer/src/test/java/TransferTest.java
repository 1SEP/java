import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rauf on 29.06.2015.
 */
public class TransferTest {

    private Transfer testTransfer;
    private Transable[] testTransables;
    private Transable[] testTransables2;

    @Before
    public void setUp() throws Exception {
        testTransfer = new Transfer();
        testTransables = new Transable[0];
        testTransables2 = new Transable[0];
        for(int i=0;i<10;i++){
            testTransables[i]=new Man(i,"newman"+i);
        }
        for(int i=0;i<10;i++){
            testTransables2[i]=new Woman(i,"newwoman"+i);
        }
    }

    @Test
    public void testTransAll() throws Exception {
        testTransfer.transAll(testTransables);
        Class expected = testTransables.getClass();
        Class actual=testTransables2.getClass();
        assertEquals(expected,actual);
    }

}