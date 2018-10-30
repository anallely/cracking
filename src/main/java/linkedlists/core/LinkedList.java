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

    public LinkedList(int[] elements){
        for (int i = elements.length - 1; i >= 0; i--) {
            addFirst(elements[i]);
        }
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
                s += (s.isEmpty() ? "" : ", ") + indexNode.getData();
                indexNode = indexNode.getNext();
            } while (indexNode != null);
        }

        return s;
    }
}
