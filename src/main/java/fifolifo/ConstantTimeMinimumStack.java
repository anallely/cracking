package fifolifo;

import fifolifo.core.EmptyStackException;
import fifolifo.core.StackNode;

public class ConstantTimeMinimumStack {

  private StackNode lastInserted;


  void push(int element) {
    if (lastInserted == null) {
      StackNode stackNode = new StackNode(element);
      lastInserted = stackNode;
    } else {
      int min = element < lastInserted.getMin() ? element : lastInserted.getMin();
      StackNode stackNode = new StackNode(element, min);
      lastInserted.setNext(stackNode);
      stackNode.setPrevius(lastInserted);
      lastInserted = stackNode;
    }
  }

  int pop() throws EmptyStackException {
    if (lastInserted == null) {
      throw new EmptyStackException("The stack is empty");
    }

    int data = lastInserted.getData();

    lastInserted = lastInserted.getPrevius();

    return data;
  }

  int min() throws EmptyStackException {
    if (lastInserted == null) {
      throw new EmptyStackException("The stack is empty");
    }

    return lastInserted.getMin();
  }

}
