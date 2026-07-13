package lecture.chapter12;

public class BinaryTree<D extends Comparable<D>> {

  private Node root;
  private int size;

  public BinaryTree() {
    root = null;
    size = 0;
  }

  public boolean add(D data){
    if (root == null) {
      root = new Node(data);
      size++;
      return true;
    }

    return add(root, data);
  }

  private boolean add(Node currentNode, D data){
    int comparison = data.compareTo(currentNode.getData());
    if (comparison < 0) {
      if(currentNode.getLeftNode() == null){
        currentNode.setLeftNode(new Node(data));
        size++;
        return true;
      }else {
        return add(currentNode.getLeftNode(), data);
      }
    }
    if (comparison > 0) {
      if(currentNode.getRightNode() == null){
        currentNode.setRightNode(new Node(data));
        size++;
        return true;
      }else {
        return add(currentNode.getRightNode(), data);
      }
    } else {
      return false;
    }
  }

  public boolean addIterativ(D data) {
    Node newNode = new Node(data);

    if (root == null) {
      root = newNode;
      size++;
      return true;
    }

    Node currentNode = root;
    while (true) {
      int comparison = data.compareTo(currentNode.getData());
      if (comparison < 0) {
        if (currentNode.getLeftNode() == null) {
          currentNode.setLeftNode(newNode);
          size++;
          return true;
        }
        currentNode = currentNode.getLeftNode();
      } else if(comparison > 0) {
        if (currentNode.getRightNode() == null) {
          currentNode.setRightNode(newNode);
          size++;
          return true;
        }
        currentNode = currentNode.getRightNode();
      } else {
        return false;
      }
    }
  }

  public int size() {
    return size;
  }

  public void clear(){
    root = null;
    size = 0;
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