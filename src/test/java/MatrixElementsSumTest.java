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
public class MatrixElementsSumTest {

    private int[][] theInput;

    private int theExpected;

    @Parameters
    public static Collection<Object[]> data() {
        int[][] m1 = {{0,1,1,2}, {0,5,0,0}, {2,0,3,3}};

        return Arrays.asList(
            new Object[][] {
                {m1, 9},
            }
        );
    }

    public MatrixElementsSumTest(int[][] input, int expected) {
        theInput = input;
        theExpected = expected;
    }


    @Test
    public void almostIncreasingTest() {
        MatrixElementsSum matrixElementsSum = new MatrixElementsSum();
        int result = matrixElementsSum.matrixElementsSum(theInput);
        assertEquals(theExpected, result);
    }

}
