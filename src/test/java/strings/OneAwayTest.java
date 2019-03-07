package strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OneAwayTest {

    private String a;
    private String b;
    private boolean expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                    {"pale", "pale", true },
                    {"pale", "bale", true },
                    {"pale", "mole", false },
                    {"anallely", "analiely", true },
                    {"anallely", "analleli", true },
                    {"cat", "tac", false },
                    {"pales", "pale", true },
                    {"pale", "ple", true },
                    {"pale", "bake", false },
                    {"annallely", "ana", false },
                    {"annallely", "anallely", true },
                    {"anallely", "annallely", true },
                }
        );
    }

    public OneAwayTest(String a, String b, boolean expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void doOneAwayTest() {
        boolean result = OneAway.isOneAway(a, b);
        assertEquals(expected, result);
    }
}
