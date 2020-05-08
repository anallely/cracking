package hackerrank.arrays;

import static org.junit.Assert.assertEquals;

import array.ZeroMatrix;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HourglassSumTest {

  private int [][] input;
  private int expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    int[][] m1 = { {1,1,1,0,0,0},
                   {0,1,0,0,0,0},
                   {1,1,1,0,0,0},
                   {0,0,2,4,4,0},
                   {0,0,0,2,0,0},
                   {0,0,1,2,4,0}
    };

    int[][] m2 = {
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {0, 9, 2, -4, -4, 0},
      {0, 0, 0, -2, 0, 0},
      {0, 0, -1, -2, -4, 0}
    };

    return Arrays.asList(
      new Object[][] {
        {m1, 19},
        {m2, 13}
      }
    );
  }


  public HourglassSumTest(int [][] input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void getMaxHourglassSum() {
    int result = HourglassSum.hourglassSum(input);
    assertEquals(expected, result);
  }

}
