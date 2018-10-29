package linkedlists;

import linkedlists.core.LinkedList;
import linkedlists.core.Node;

public class RemoveKFromList {

    public LinkedList removeKFromList(LinkedList l, int k) {
        Node current = l.getHead();
        Node previous = null;

        while ( current != null) {
            if (current.getData() == k) {

                if (previous != null) {
                    previous.setNext( current.getNext());
                } else {
                    l.setHead(current.getNext());
                }
            } else {
                previous = current;
            }
            current = current.getNext();
        }
        return  l;
    }

}
