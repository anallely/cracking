package linkedlists;
import linkedlists.core.LinkedList;
import linkedlists.core.Node;

public class DeleteGivenMiddleNode {

    /**
     * This node is part of a single linked list, but we need to delete it, this function removes this node from the original list
     * @param node
     */
    public static void deleteGivenMiddleNode (Node node) {

        Node previous = null;

        while (node != null) {
            Node nextNode = node.getNext();

            if (nextNode != null) {
                node.setData(nextNode.getData());
                previous = previous == null ? node : previous.getNext();
                node = nextNode;
            } else {
                node = null;
                previous.setNext(null);
            }
        }
    }

}
