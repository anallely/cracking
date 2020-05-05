package hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CountingValleysTest {

  private String theInput;

  private int theExpected;

  @Parameters
  public static Collection<Object[]> data() {
    String seq1 = "UDDDUDUU";
    String seq2 = "DDDUUUUDDUUDDUUD";
    String seq3 = "UUUDDD";


    return Arrays.asList(
      new Object[][] {
        {seq1, 1},
        {seq2, 3},
        {seq3, 0},
      }
    );
  }

  public CountingValleysTest(String input, int expected) {
    theInput = input;
    theExpected = expected;
  }

  @Test
  public void countingValleysTest() {
    CountingValleys countingValleys = new CountingValleys();
    int result = countingValleys.countingValleys(theInput.length(), theInput);
    assertEquals(theExpected, result);
  }

}
