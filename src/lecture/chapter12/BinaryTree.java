package lecture.chapter12;

public class BinaryTree<D extends Comparable<D>> {

  private Node root;
  private int size;

  public BinaryTree() {
    root = null;
    size = 0;
  }

  public void add(D data) {
    Node newNode = new Node(data);

    if (root == null) {
      root = newNode;
      return;
    }

    Node currentNode = root;
    while (true) {
      int comparison = data.compareTo(currentNode.getData());
      if (comparison <= 0) {
        if (currentNode.getLeftNode() == null) {
          currentNode.setLeftNode(newNode);
          size++;
          break;
        }
        currentNode = currentNode.getLeftNode();
      } else {
        if (currentNode.getRightNode() == null) {
          currentNode.setRightNode(newNode);
          size++;
          break;
        }
        currentNode = currentNode.getRightNode();
      }
    }
  }

  public int size() {
    return size;
  }

  private class Node {
    private D data;
    private Node leftNode;
    private Node rightNode;

    Node(D data) {
      this.data = data;
      this.leftNode = null;
      this.rightNode = null;
    }

    void setLeftNode(Node leftNode) {
      this.leftNode = leftNode;
    }

    Node getLeftNode() {
      return this.leftNode;
    }

    void setRightNode(Node rightNode) {
      this.rightNode = rightNode;
    }

    Node getRightNode() {
      return this.rightNode;
    }

    D getData() {
      return this.data;
    }
  }

}