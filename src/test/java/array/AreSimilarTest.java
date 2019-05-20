package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AreSimilarTest {

  private int [] a;
  private int [] b;
  private boolean expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {

    int[] a = {2, 3, 1};
    int[] b = {1, 3, 2};

    int[] c = {2, 3, 9};
    int[] d = {10, 3, 2};

    int[] e = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
    int[] f = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};

    return Arrays.asList(
      new Object[][] {
        {a, b, true},
        {c, d, false},
        {e, f, true}
      }
    );
  }


  public AreSimilarTest(int[] a, int[] b, boolean expected) {
    this.a = a;
    this.b = b;
    this.expected = expected;
  }

  @Test
  public void doAreSimilar() {
    boolean result = AreSimilar.areSimilar(a, b);
    assertEquals(expected, result);
  }

}
