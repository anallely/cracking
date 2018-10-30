package linkedlists;

import linkedlists.core.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ReturnKthToLastTest {

    private LinkedList input;
    private int kth;
    private int expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        int[] input1 = {1, 2, 8, 3, 7, 0, 4};
        return Arrays.asList(
                new Object[][] {
                    { new LinkedList(input1), 3, 7 },
                    { new LinkedList(input1), 7, 1 },
                    { new LinkedList(input1), 8, -1 },
                }
        );
    }

    public ReturnKthToLastTest(LinkedList input, int kth, int expected) {
        this.input = input;
        this.kth = kth;
        this.expected = expected;
    }

    @Test
    public void deleteDuplicatesTest() {
        assertEquals( expected, ReturnKthToLast.returnKthToLast( input, kth ));
    }
}
