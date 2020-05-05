package hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JumpingOnCloudsTest {

  private int[] theInput;

  private int theExpected;

  @Parameters
  public static Collection<Object[]> data() {
    int[] seq1 = {0, 0, 1, 0, 0, 1, 0};
    int[] seq2 = {0, 0, 0, 0, 1, 0};
    int[] seq3 = {0, 1, 0};

    return Arrays.asList(
      new Object[][] {
        {seq1, 4},
        {seq2, 3},
        {seq3, 1}
      }
    );
  }

  public JumpingOnCloudsTest(int[] input, int expected) {
    theInput = input;
    theExpected = expected;
  }

  @Test
  public void jumpingOnClouds() {
    JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();
    int result = jumpingOnClouds.jumpingOnClouds(theInput);
    assertEquals(theExpected, result);
  }

}
