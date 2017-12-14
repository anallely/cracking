/**
 * Created by anallely.olivares on 11/29/2017.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsLuckyTest {

    private int n;
    private boolean theExpected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
            new Object[][] {
                {1230, true},
            }
        );
    }

    public IsLuckyTest(int m, boolean expected) {
        n = m;
        theExpected = expected;
    }


    @Test
    public void almostIncreasingTest() {
        IsLucky isLucky = new IsLucky();
        boolean result = isLucky.isLucky(n);
        assertEquals(theExpected, result);
    }

}
