package linkedlists;

import linkedlists.core.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RemoveKFromListTest {

    private LinkedList input;
    private int k;
    private String expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        int[] input1 = {1, 2, 3, 4, 5};
        int k1 = 7;
        String expected1 = "1, 2, 3, 4, 5";

        int[] input2 = {1, 1, 3, 4, 3, 6, 7, 4};
        int k2 = 3;
        String expected2 = "1, 1, 4, 6, 7, 4";

        int[] input3 = {1, 1, 1, 1};
        int k3 = 1;
        String expected3 = "";

        return Arrays.asList(
                new Object[][] {
                    { new LinkedList(input1), k1, expected1 },
                    { new LinkedList(input2), k2, expected2 },
                    { new LinkedList(input3), k3, expected3 }
                }
        );
    }

    public RemoveKFromListTest(LinkedList input, int k, String expected) {
        this.input = input;
        this.k = k;
        this.expected = expected;
    }

    @Test
    public void deleteDuplicatesTest() {
        assertEquals( expected, new RemoveKFromList().removeKFromList( input, k ).toString());
    }
}
