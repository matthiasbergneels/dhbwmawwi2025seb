package lecture.chapter12;

public class LinkedNumberList {

  private Node firstNode;

  public LinkedNumberList() {
    firstNode = null;
  }

  // add new Data to List
  public void add(int data) {
    Node newNode = new Node(data);

    if (firstNode == null) {
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while (currentNode.getNextNode() != null) {
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
  }

  // get current element count
  public int size(){
    // TODO: implement
    return 0;
  }

  // print all data elements of the list
  public void printList(){
    // TODO: implement
  }

  // get data element at index
  public int get(int index){
    return 0;
  }

  // remove data element from List at index
  public void remove(int index){
    // TODO: implement
  }


  private class Node {
    private int data;
    private Node nextNode;

    Node(int data){
      this.data = data;
      this.nextNode = null;
    }

    void setNextNode(Node nextNode){
      this.nextNode = nextNode;
    }

    Node getNextNode(){
      return this.nextNode;
    }

    int getData(){
      return this.data;
    }
  }

}
