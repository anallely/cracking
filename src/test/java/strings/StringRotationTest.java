package strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringRotationTest {

  private String base;
  private String candidate;
  private boolean expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
      new Object[][]{
        {"interview", "interview", true},
        {"interview", "erviewint", true},
        {"bottlewater", "terbottlewa", true},
        {"bottlewater", "water", false},
        {"water", "bottlewater", false},
      }
    );
  }

  public StringRotationTest(String input, String realSize, boolean expected) {
    this.base = input;
    this.candidate = realSize;
    this.expected = expected;
  }

  @Test
  public void doStringRotationTest() {
    boolean result = StringRotation.isARotation(base, candidate);
    assertEquals(expected, result);
  }
}
