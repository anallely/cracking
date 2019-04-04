package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ZeroMatrix90Test {

  private int [][] input;
  private int [][] expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    int[][] m1 = { {1,1,1,1,1,1,1,1},
                   {1,0,1,1,1,1,1,1},
                   {1,1,1,1,1,1,1,1},
                   {1,1,1,1,1,0,1,1},
                   {1,1,1,1,1,1,1,1},
                   {1,1,1,0,1,1,1,1},
                   {1,0,1,1,1,1,1,1}
    };
    int[][] m2 = { {1,0,1,0,1,0,1,1},
                   {0,0,0,0,0,0,0,0},
                   {1,0,1,0,1,0,1,1},
                   {0,0,0,0,0,0,0,0},
                   {1,0,1,0,1,0,1,1},
                   {0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0},
    };
    return Arrays.asList(
      new Object[][] {
        {m1, m2}
      }
    );
  }


  public ZeroMatrix90Test(int [][] input, int [][] expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void doZeroFilling() {
    int [][] result = ZeroMatrix.zeroMatrix(input);
    assertEquals(expected, result);
  }

}
