package linkedlists.core;

public class LinkedList {

    Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public LinkedList() {
    }

    public void addFirst(int element) {
        Node newElement = new Node(element);

        if (head == null) {
            head = newElement;
        } else {
            newElement.setNext( head );
            head = newElement;
        }
    }

    @Override
    public String toString() {
        Node indexNode = head;
        String s = "";

        if (indexNode != null) {
            do {
                s += (s.isEmpty() ? "" : ", ") + indexNode.data;
                indexNode = indexNode.next;
            } while (indexNode != null);
        }

        return s;
    }
}
