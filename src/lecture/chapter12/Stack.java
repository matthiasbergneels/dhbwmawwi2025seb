package lecture.chapter12;

public class Stack<D> {

  private Node topNode;
  private int size;

  public Stack() {
    topNode = null;
    size = 0;
  }

  // O(1)
  public void push(D data) {
    Node newNode = new Node(data, topNode);
    topNode = newNode;
    size++;
  }

  // O(1)
  public D pop() {
    if (topNode == null) {
      return null;
    }
    D data = topNode.getData();
    topNode = topNode.getNextNode();
    size--;
    return data;
  }

  // O(1)
  public D peek() {
    if (topNode == null) {
      return null;
    }
    return topNode.getData();
  }

  // O(1)
  public int size() {
    return size;
  }

  // O(1)
  public boolean isEmpty() {
    return topNode == null;
  }

  // Inner Element Class
  private class Node {
    private D data;
    private Node nextNode;

    Node(D data, Node nextNode) {
      this.data = data;
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