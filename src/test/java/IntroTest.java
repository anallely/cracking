/**
 * Created by anallely.olivares on 11/29/2017.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IntroTest {

    private int[] theInput;

    private boolean theExpected;

    @Parameters
    public static Collection<Object[]> data() {

        int[] seq1 = {3, 5, 67, 98, 3, 104};
        int[] seq2 = {1, 3, 2, 1};
        int[] seq3 = {1, 2, 1, 2};
        int[] seq4 = {10, 1, 2, 3, 4, 5};
        int[] seq5 = {1, 2, 5, 3, 5};
        int[] seq6 = {3, 5, 67, 98, 3};
        int[] seq7 = {1, 1};
        int[] seq8 = {1};

        return Arrays.asList(
            new Object[][] {
                {seq1, true},
                {seq2, false},
                {seq3, false},
                {seq4, true},
                {seq5, true},
                {seq6, true},
                {seq7, true},
                {seq8, true}
            }
        );
    }

    public IntroTest(int[] input, boolean expected) {
        theInput = input;
        theExpected = expected;
    }


    @Test
    public void almostIncreasingTest() {
        Intro intro = new Intro();
        boolean result = intro.almostIncreasingSequence(theInput);
        assertEquals(theExpected, result);
    }

}
