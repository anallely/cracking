package linkedlists; /**
 * Created by anallely.olivares on 11/29/2017.
 */

import linkedlists.core.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void addFirstTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);

        assertEquals("4, 3, 2, 1", linkedList.toString());
    }

}
