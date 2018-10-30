package linkedlists;

import linkedlists.core.LinkedList;
import linkedlists.core.Node;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DeleteGivenMiddleNodeTest {

    @Test
    public void deleteGivenMiddleNodeTest() {
        int[] input1 = {1, 2, 3, 4, 5};
        LinkedList originalLinkedList = new LinkedList(input1);
        Node node = originalLinkedList.getHead().getNext().getNext(); // 3
        String expectedRepresentation = "1, 2, 4, 5";

        DeleteGivenMiddleNode.deleteGivenMiddleNode( node );
        assertEquals( expectedRepresentation, originalLinkedList.toString() );
    }

    @Test
    public void deleteGivenMiddleNodeOptimizedTest() {
        int[] input1 = {1, 2, 3, 4, 5};
        LinkedList originalLinkedList = new LinkedList(input1);
        Node node = originalLinkedList.getHead().getNext().getNext(); // 3
        String expectedRepresentation = "1, 2, 4, 5";

        DeleteGivenMiddleNode.deleteGivenMiddleNodeOptimized( node );
        assertEquals( expectedRepresentation, originalLinkedList.toString() );
    }
}
