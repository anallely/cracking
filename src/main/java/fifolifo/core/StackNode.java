package fifolifo.core;

public class StackNode {
  private int data;

  public StackNode getPrevius() {
    return previus;
  }

  public void setPrevius(StackNode previus) {
    this.previus = previus;
  }

  private StackNode previus;
  private StackNode next;
  private int min;

  public StackNode getNext() {
    return next;
  }

  public void setNext(StackNode next) {
    this.next = next;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public StackNode(int data) {
    this.data = data;
    this.min = data;
  }

  public StackNode(int data, int min) {
    this.data = data;
    this.min = min;
  }
}