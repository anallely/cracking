package strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ReverseInParenthesesTest {

    private String input;
    private String expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                  {"foo", "foo" },
                  {"(foo)", "oof" },
                  {"bar(foo)", "baroof" },
                  {"(bar(foo))", "foorab" },
                  {"foo(bar(baz))blim", "foobazrabblim" }
                }
        );
    }

    public ReverseInParenthesesTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void doURLifyTest() {
        String actual = ReverseInParentheses.doReverseInParentheses(input);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
