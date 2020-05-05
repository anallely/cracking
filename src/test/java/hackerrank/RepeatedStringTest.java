package hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RepeatedStringTest {

  private String theInput;

  private long n;

  private long theExpected;

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
      new Object[][] {
        {"aba", 10L, 7L},
        {"a", 1000000000000L, 1000000000000L}
      }
    );
  }

  public RepeatedStringTest(String input, long n, long expected) {
    this.theInput = input;
    this.n = n;
    this.theExpected = expected;
  }

  @Test
  public void repeatedStringTest() {
    RepeatedString repeatedString = new RepeatedString();
    long result = repeatedString.repeatedString(theInput, n);
    assertEquals(theExpected, result);
  }

}
