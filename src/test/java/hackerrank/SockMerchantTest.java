package hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SockMerchantTest {

  private int[] theInput;

  private int theExpected;

  @Parameters
  public static Collection<Object[]> data() {
    int[] seq1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    int[] seq2 = {};
    int[] seq3 = {10, 20, 30, 40};

    return Arrays.asList(
      new Object[][] {
        {seq1, 3},
        {seq2, 0},
        {seq3, 0}
      }
    );
  }

  public SockMerchantTest(int[] input, int expected) {
    theInput = input;
    theExpected = expected;
  }

  @Test
  public void sockMerchantTest() {
    SockMerchant sockMerchant = new SockMerchant();
    int result = sockMerchant.sockMerchant(theInput.length, theInput);
    assertEquals(theExpected, result);
  }

}
