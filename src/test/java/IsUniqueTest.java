import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsUniqueTest {

    private String input;

    private boolean theExpected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                        {"abcde", true},
                        {"c", true},
                        {"abccde", false},
                        {"aa", false},
                        {"", true},
                        {"%11223344%", false},
                }
        );
    }

    public IsUniqueTest(String input, boolean expected) {
        this.input = input;
        this.theExpected = expected;
    }

    @Test
    public void isUniqueTest() {
        boolean result = new IsUnique().isUnique(input);
        assertEquals(theExpected, result);
    }
}
