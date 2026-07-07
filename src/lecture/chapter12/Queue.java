package lecture.chapter12;

public class Queue<D> {

  private Node frontNode;
  private Node backNode;
  private int size;

  public Queue() {
    frontNode = null;
    backNode = null;
    size = 0;
  }

  // O(1)
  public void enqueue(D data) {
    Node newNode = new Node(data);
    size++;

    if (backNode != null) {
      backNode.setNextNode(newNode);
    }
    backNode = newNode;
    if (frontNode == null) {
      frontNode = newNode;
    }

  }

  // O(1)
  public D dequeue() {
    if (frontNode == null) {
      return null;
    }
    D data = frontNode.getData();
    frontNode = frontNode.getNextNode();
    if (frontNode == null) {
      backNode = null;
    }
    size--;
    return data;
  }

  // O(1)
  public int size() {
    return size;
  }

  // O(1)
  public boolean isEmpty() {
    return frontNode == null;
  }

  private class Node {
    private D data;
    private Node nextNode;

    Node(D data) {
      this.data = data;
      this.nextNode = null;
    }

    void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }

    Node getNextNode() {
      return this.nextNode;
    }

    D getData() {
      return this.data;
    }
  }

}