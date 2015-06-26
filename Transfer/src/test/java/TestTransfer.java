import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.fsep.lessons.transfer.Human;
import ru.fsep.lessons.transfer.Man;
import ru.fsep.lessons.transfer.Transfer;
import ru.fsep.lessons.transfer.Woman;

import static junit.framework.Assert.*;

/**
 * Created by Надежда on 26.06.2015.
 */
public class TestTransfer {

    public Woman testingWoman;
    public Man testingMan;
    public Transfer testTransfer;

    @Before
    public void setUp() throws Exception{
        testingWoman  = new Woman(25,"Sony");
         testingMan = new Man (35,"Victor");
        testTransfer = new Transfer();
      }

    @Test
    public void testWoman_Man(){
        Class expected = testingMan.getClass();
        Class actual = testTransfer.transfer(testingWoman).getClass();
        assertEquals(expected, actual);
    }
}
