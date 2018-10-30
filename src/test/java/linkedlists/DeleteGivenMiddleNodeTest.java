package linkedlists;

import linkedlists.core.LinkedList;
import linkedlists.core.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DeleteGivenMiddleNodeTest {

    private LinkedList originalLinkedList;
    private Node node;
    private String expectedRepresentation;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        int[] input1 = {1, 2, 3, 4, 5};
        LinkedList originalLinkedList1 = new LinkedList(input1);
        Node node = originalLinkedList1.getHead().getNext().getNext(); // 3
        String expectedRepresentation = "1, 2, 4, 5";

        return Arrays.asList(
                new Object[][] {
                    { originalLinkedList1, node, expectedRepresentation },
                }
        );
    }

    public DeleteGivenMiddleNodeTest(LinkedList input, Node node, String expectedRepresentation) {
        this.originalLinkedList = input;
        this.node = node;
        this.expectedRepresentation = expectedRepresentation;
    }

    @Test
    public void deleteGivenMiddleNodeTest() {

        DeleteGivenMiddleNode.deleteGivenMiddleNode( node );
        assertEquals( expectedRepresentation, originalLinkedList.toString() );
    }
}
