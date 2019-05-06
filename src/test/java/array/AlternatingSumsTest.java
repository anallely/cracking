package array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AlternatingSumsTest {

  private int [] input;
  private int [] expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    int[] input1 = {50,60,60,45,70};
    int[] output1 = {180, 105};
    return Arrays.asList(
      new Object[][] {
        {input1, output1},
      }
    );
  }


  public AlternatingSumsTest(int [] input, int [] expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void doAlternatingSums() {
    int []result = AlternatingSums.alternatingSums(input);
    assertArrayEquals(expected, result);
  }

}
