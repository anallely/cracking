package linkedlists;

import linkedlists.core.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import strings.URLify;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class DeleteDuplicatesTest {

    private LinkedList input;
    private String expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        int[] input1 = {1, 2, 3, 4, 5};
        String expected1 = "1, 2, 3, 4, 5";

        int[] input2 = {1, 1, 3, 4, 3, 6, 7, 4};
        String expected2 = "1, 3, 4, 6, 7";

        return Arrays.asList(
                new Object[][] {
                    { new LinkedList(input1), expected1 },
                    { new LinkedList(input2), expected2 }
                }
        );
    }

    public DeleteDuplicatesTest(LinkedList input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void deleteDuplicatesTest() {
        assertEquals( expected, new DeleteDuplicates().deleteDuplicates( input ).toString());
    }
}
