package fifolifo;

public class ThreeStacksInAnArray {

    int[] array = null;
    int[] stackIndex = {0, 0, 0, 0};
    int[] lastInsertedPosition = {0, 0, 0, 0};

    ThreeStacksInAnArray( int maxSize ) {
        array = new int[maxSize];
        // Initialize aux
        for( int i = 0; i < array.length; i++ ) {
            array[i] = -1;
        }
    }
    
    private int getNextPositionToInsert(int stackId) {
        int pos = stackIndex[stackId];
        return pos;
    }

    private void updatePositionLastElementInserted(int stackId, int position) {
        lastInsertedPosition[stackId] = position;
    }

    private void updateNextPositionToInsert(int stackId) {
        int pos = stackIndex[stackId];
        while( array[pos] != -1 ) {
            pos +=2;
        }
        stackIndex[stackId] = pos;
    }

    int getPositionLastInsertedElement(int stackId) {
        return lastInsertedPosition[stackId];
    }

    void push(int stackId, int element) {

        int nextPositionToInsert = getNextPositionToInsert(stackId);

        array[nextPositionToInsert] = stackId;
        array[nextPositionToInsert + 1] = element;

        updatePositionLastElementInserted(stackId, nextPositionToInsert + 1);
        updateNextPositionToInsert(1);
        updateNextPositionToInsert(2);
        updateNextPositionToInsert(3);
    }

    int pop (int stackId) throws EmptyStackException{
        int positionLastInsertedElement = getPositionLastInsertedElement(stackId);

        if (positionLastInsertedElement < 0) {
            throw new EmptyStackException("The stack is empty");
        }

        int element = array[positionLastInsertedElement];

        array[  positionLastInsertedElement] = -1;
        array[  positionLastInsertedElement - 1] = -1;

        do {
            positionLastInsertedElement -= 2;
        } while( positionLastInsertedElement - 3 >= 0 && array[positionLastInsertedElement - 1] != stackId );

        if (  array[positionLastInsertedElement - 1] != stackId ) {
            positionLastInsertedElement = -1;
        }
        updatePositionLastElementInserted(stackId, positionLastInsertedElement);

        return element;
    }
}
