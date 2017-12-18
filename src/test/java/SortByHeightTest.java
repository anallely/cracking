/**
 * Created by anallely.olivares on 11/29/2017.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortByHeightTest {

    private int[] theInput;

    private int[] theExpected;

    @Parameters
    public static Collection<Object[]> data() {
        int[] a1 = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] r1 = {-1, 150, 160, 170, -1, -1, 180, 190};

        return Arrays.asList(
            new Object[][] {
                {a1, r1},
            }
        );
    }

    public SortByHeightTest(int[] input, int[] expected) {
        theInput = input;
        theExpected = expected;
    }


    @Test
    public void sortByHeightTest() {
        SortByHeight sortByHeight = new SortByHeight();
        int[] result = sortByHeight.sortByHeight(theInput);

        assertArrayEquals(theExpected, result);
    }
}
