package linkedlists;

import linkedlists.core.LinkedList;
import linkedlists.core.Node;

import java.util.Arrays;

public class DeleteDuplicates {

    static public LinkedList deleteDuplicates(LinkedList input) {
        boolean[] hashArray = new boolean[256];

        // Initialize hash array
        Arrays.fill(hashArray, false);

        // Iterate, look if present in hash array and delete if it is present
        Node index = input.getHead();
        Node previous = input.getHead();

        while(index != null){
            if ( hashArray[ index.getData() ] ) {
                previous.setNext( index.getNext() );
                index = index.getNext();
            } else {
                hashArray[index.getData()] = true;
                previous = index;
                index = index.getNext();
            }
        }

        return input;
    }

}
