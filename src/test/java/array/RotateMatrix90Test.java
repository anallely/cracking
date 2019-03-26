package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RotateMatrix90Test {

  private int [][] input;
  private int [][] expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    int[][] m1 = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}, {12,13,14,15}};
    int[][] m2 = {{12,8,4,0}, {13,9,5,1}, {14,10,6,2}, {15,11,7,3}};

    return Arrays.asList(
      new Object[][] {
        {m1, m2}
      }
    );
  }


  public RotateMatrix90Test(int [][] input, int [][] expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void doRotation() {
    int [][] result = RotateMatrix90.rotate90(input);
    assertEquals(expected, result);
  }
}
