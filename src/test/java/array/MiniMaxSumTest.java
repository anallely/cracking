package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MiniMaxSumTest {

  private int[] arr;
  private long[] expected;

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[][] {
            {new int[]{1,2,3,4,5}, new long[]{10,14}},
            {new int[]{256741038,623958417,467905213,714532089,938071625}, new long[]{2063136757,2744467344L}},
        }
    );
  }

  public MiniMaxSumTest(int[] arr , long[] expected) {
    this.arr = arr;
    this.expected = expected;
  }

  @Test
  public void doMiniMaxSum() {
    long[] actual = MiniMaxSum.miniMaxSumAux(arr);
    assertEquals(expected[0], actual[0]);
    assertEquals(expected[1], actual[1]);
  }

}
