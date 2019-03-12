package strings;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
@RunWith(Parameterized.class)
public class StringCompressionTest {
  private String input;
  private String expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
      new Object[][] {
        {"aaabbbccc", "a3b3c3"},
        {"abbcccddddeeeee", "a1b2c3d4e5"},
        {"aabbcc", "aabbcc"},
        {"abcd", "abcd"},
        {"aaaaaaaaaa", "a10"},
        {"aaaaaaaaaabcdefg", "a10b1c1d1e1f1g1" },
        {"aaaaaaaaaabcdefgh", "aaaaaaaaaabcdefgh" },
      }
    );
  }


  public StringCompressionTest(String input, String expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void doStringCompressionTest() {
    String result = StringCompression.doCompression(input);
    assertEquals(expected, result);
  }

}
