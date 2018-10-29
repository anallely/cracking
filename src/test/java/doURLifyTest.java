import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import strings.URLify;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class doURLifyTest {

    private String input;
    private int realSize;
    private String expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                        {"abcde", 5, "abcde" },
                        {"   ", 1, "%20"},
                        {"Mr John Smith    ", 13, "Mr%20John%20Smith"},
                }
        );
    }

    public doURLifyTest(String input, int realSize, String expected) {
        this.input = input;
        this.realSize = realSize;
        this.expected = expected;
    }

    @Test
    public void doURLifyTest() {
        char[] result = new URLify().doURLify(input.toCharArray(), realSize);
        assertTrue(Arrays.equals(expected.toCharArray(), result));
    }
}
