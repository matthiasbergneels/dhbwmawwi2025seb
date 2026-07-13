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


  // Path traversal

  // InOrder - print in correct sorting order
  public void print(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    inOrderTraversal(root);
  }

  // left - root - right
  private void inOrderTraversal(Node currentNode){
    if(currentNode.getLeftNode() != null){
      inOrderTraversal(currentNode.getLeftNode());
    }
    System.out.println(currentNode.getData());
    if(currentNode.getRightNode() != null){
      inOrderTraversal(currentNode.getRightNode());
    }
  }

  // PreOrder - ???
  public void printPreOrder(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    preOrderTraversal(root);
  }

  // root - left - right
  private void preOrderTraversal(Node currentNode){
    System.out.println(currentNode.getData());
    if(currentNode.getLeftNode() != null){
      preOrderTraversal(currentNode.getLeftNode());
    }
    if(currentNode.getRightNode() != null){
      preOrderTraversal(currentNode.getRightNode());
    }
  }

  // PostOrder - ???
  public void printPostOrder(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    postOrderTraversal(root);
  }

  // left - right - root
  private void postOrderTraversal(Node currentNode){
    if(currentNode.getLeftNode() != null){
      postOrderTraversal(currentNode.getLeftNode());
    }
    if(currentNode.getRightNode() != null){
      postOrderTraversal(currentNode.getRightNode());
    }
    System.out.println(currentNode.getData());
  }

  public boolean contains(D data){
    if(root == null){
      return false;
    }

    return contains(root, data);
  }

  private boolean contains(Node currentNode, D data){
    int comparison = data.compareTo(currentNode.getData());
    if(comparison == 0) {
      return true;
    }else if(comparison < 0) {
      if(currentNode.getLeftNode() == null){
        return false;
      }
      return contains(currentNode.getLeftNode(), data);
    }else {
      if(currentNode.getRightNode() == null){
        return false;
      }
      return contains(currentNode.getRightNode(), data);
    }
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