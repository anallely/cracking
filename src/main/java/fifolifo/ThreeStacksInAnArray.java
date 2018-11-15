package fifolifo;

import fifolifo.core.EmptyStackException;

public class ThreeStacksInAnArray {
    int[] array;
    int nextPositionToInsert = 0;
    int[] lastInsertedPosition = {0, 0, 0, 0};

    ThreeStacksInAnArray( int maxSize ) {
        array = new int[maxSize];
        // Initialize aux
        for( int i = 0; i < array.length; i++ ) {
            array[i] = -1;
        }
    }

    private void updateNextPositionToInsert() {
        while( array[nextPositionToInsert] != -1 ) {
            nextPositionToInsert += 2;
        }
    }

    void push(int stackId, int element) {
        array[nextPositionToInsert] = stackId;
        array[nextPositionToInsert + 1] = element;

        lastInsertedPosition[stackId] = nextPositionToInsert + 1;
        updateNextPositionToInsert();
    }

    int pop (int stackId) throws EmptyStackException {
        int positionLastInsertedElement = lastInsertedPosition[stackId];

        if (positionLastInsertedElement < 0) {
            throw new EmptyStackException("The stack is empty");
        }

        int element = array[positionLastInsertedElement];

        array[  positionLastInsertedElement] = -1;
        array[  positionLastInsertedElement - 1] = -1;

        if ( nextPositionToInsert > positionLastInsertedElement - 1 ) {
            nextPositionToInsert = positionLastInsertedElement - 1;
        }

        do {
            positionLastInsertedElement -= 2;
        } while( positionLastInsertedElement - 1 >= -1 && array[positionLastInsertedElement - 1] != stackId );
        lastInsertedPosition[stackId] = positionLastInsertedElement;

        return element;
    }
}
