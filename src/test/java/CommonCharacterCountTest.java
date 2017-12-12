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
public class CommonCharacterCountTest {

    private String s1;
    private String s2;

    private int theExpected;

    @Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(
            new Object[][] {
                {"aabcc", "adcaa", 3},
            }
        );
    }

    public CommonCharacterCountTest(String inputS1, String inputS2, int expected) {
        s1 = inputS1;
        s2 = inputS2;
        theExpected = expected;
    }


    @Test
    public void almostIncreasingTest() {
        CommonCharacterCount commonCharacterCount = new CommonCharacterCount();
        int result = commonCharacterCount.commonCharacterCount(s1, s2);
        assertEquals(theExpected, result);
    }

}
