package linkedlists;

import linkedlists.core.LinkedList;
import linkedlists.core.Node;

public class ReturnKthToLast {

    public static int returnKthToLast (LinkedList l, int kth) {

        Node current = l.getHead();
        Node endFinder = l.getHead();

        // Achieve a separation of kth positions
        for ( int i = 0; i < kth; i++) {
            if ( endFinder != null) {
                endFinder = endFinder.getNext();
            } else {
                return -1;
            }
        }

        // Advance at the same time until the end
        while (endFinder != null) {
            current = current.getNext();
            endFinder = endFinder.getNext();
        }

        return current.getData();
    }

}
