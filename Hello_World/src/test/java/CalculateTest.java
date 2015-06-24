import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by almaz on 18.06.15.
 */
public class CalculateTest {

    @Test
    public void testCalc() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.Calc(2,2);
        Assert.assertEquals(4,n);
    }
}