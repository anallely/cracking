package fifolifo;

public class ThreeStacksInAnArray {

    int[] array = null;
    int nextPositionToInsert = 0;
    int[] lastInsertedPosition = {0, 0, 0, 0};

    ThreeStacksInAnArray( int maxSize ) {
        array = new int[maxSize];
        // Initialize aux
        for( int i = 0; i < array.length; i++ ) {
            array[i] = -1;
        }
    }

    private void updatePositionLastElementInserted(int stackId, int position) {
        lastInsertedPosition[stackId] = position;
    }

    private void updateNextPositionToInsert() {
        while( array[nextPositionToInsert] != -1 ) {
            nextPositionToInsert += 2;
        }
    }

    int getPositionLastInsertedElement(int stackId) {
        return lastInsertedPosition[stackId];
    }

    void push(int stackId, int element) {

        array[nextPositionToInsert] = stackId;
        array[nextPositionToInsert + 1] = element;

        updatePositionLastElementInserted(stackId, nextPositionToInsert + 1);
        updateNextPositionToInsert();
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
        } while( positionLastInsertedElement - 1 >= 0 && array[positionLastInsertedElement - 1] != stackId );

        if ( positionLastInsertedElement - 1 >= 0 && array[positionLastInsertedElement - 1] != stackId ) {
            positionLastInsertedElement = -1;
        }
        updatePositionLastElementInserted(stackId, positionLastInsertedElement);

        return element;
    }
}
