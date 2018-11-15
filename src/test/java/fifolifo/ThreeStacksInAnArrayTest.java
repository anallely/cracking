package fifolifo;


import fifolifo.core.EmptyStackException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ThreeStacksInAnArrayTest {

    @Test
    public void popAndPushTestSingleStack() {
        ThreeStacksInAnArray tripleStack = new ThreeStacksInAnArray( 256 );
        // Stacks Ids are 1, 2 and 3

        tripleStack.push( 1, 22);
        tripleStack.push( 1, 12);

        try {
            assertEquals(12, tripleStack.pop(1));
            assertEquals(22, tripleStack.pop(1));
        } catch (EmptyStackException emptyStackException) {
            fail( "It shouldn't throws emptyStackException at this moment" );
        }

        try {
            tripleStack.pop(1);
            fail( "No more elements in stack 1, it should fail" );
        } catch (EmptyStackException emptyStackException) {
            assertEquals("The stack is empty", emptyStackException.getMessage());
        }
    }


    @Test
    public void popAndPushTestThreeStacks() {
        ThreeStacksInAnArray tripleStack = new ThreeStacksInAnArray( 256 );
        // Stacks Ids are 1, 2 and 3

        tripleStack.push( 1, 8);
        tripleStack.push( 1, 4);
        tripleStack.push( 2, 7);
        tripleStack.push( 3, 1);
        tripleStack.push( 2, 5);
        tripleStack.push( 3, 56);

        try {
            assertEquals(5, tripleStack.pop(2));
            assertEquals(7, tripleStack.pop(2));
            assertEquals(4, tripleStack.pop(1));
            assertEquals(56, tripleStack.pop(3));
            assertEquals(1, tripleStack.pop(3));
        } catch (EmptyStackException emptyStackException) {
            fail( "It shouldn't throws emptyStackException at this moment" );
        }

        tripleStack.push( 1, 11);
        tripleStack.push( 2, 22);
        tripleStack.push( 3, 33);

        try {
            assertEquals(11, tripleStack.pop(1));
        } catch (EmptyStackException emptyStackException) {
            fail( "It shouldn't throws emptyStackException at this moment" );
        }
    }
}
