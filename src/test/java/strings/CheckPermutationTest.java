package strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckPermutationTest {

    private String a;
    private String b;

    private boolean expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                        {"arigato", "toiraag", true},
                        {"abcd", "efcba", false},
                        {"root", "r0ot", false}
                }
        );
    }

    public CheckPermutationTest(String a, String b, boolean expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void isPermutation() {
        boolean result = new CheckPermutation().isPermutation(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void isPermutationN2() {
        boolean result = new CheckPermutation().isPermutationN2(a, b);
        assertEquals(expected, result);
    }
}
