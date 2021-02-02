package array;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LeftRotationTest {

  private List arr;
  private Integer d;
  private List expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {

    List arr1 = Arrays.asList(1, 2, 3, 4, 5);
    int d = 4;
    List res1 = Arrays.asList(5, 1, 2, 3, 4);

    return Arrays.asList(
      new Object[][] {
        {arr1, d, res1},
      }
    );
  }


  public LeftRotationTest(List arr , Integer d, List expected) {
    this.arr = arr;
    this.d = d;
    this.expected = expected;
  }

  @Test
  public void doLeftRotation() {
    List result = LeftRotation.rotateLeft(d, arr);
    assertEquals(expected, result);
  }

}
