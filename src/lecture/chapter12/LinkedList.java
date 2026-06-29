package lecture.chapter12;

public class LinkedList<D> {

  private Node firstNode;
  private int size;

  public LinkedList() {
    firstNode = null;
    size = 0;
  }

  // add new Data to List
  public void add(D data) {
    Node newNode = new Node(data);
    size++;

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

  /*
  // get current element count
  public int size() {
    int size = 0;                               // 1ns
    Node currentNode = firstNode;               // 1ns
    while (currentNode != null) {               // 2ns
      size++;                                   // 2ns
      currentNode = currentNode.getNextNode();  // 1ns
    }
    return size;                                // 2 ns
  }                                             // --> f(n)= n * 5ns + 4ns -> lineare Funktion --> O(n)
   */

  public int size(){
    return size;
  }

  // print all data elements of the list
  public void printList() {
    if (firstNode == null) {
      System.out.println("List is empty");
      return;
    }
    Node currentNode = firstNode;
    while (currentNode != null) {
      System.out.println(currentNode.getData());
      currentNode = currentNode.getNextNode();
    }
  }

  // get data element at index
  public D get(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    Node currentNode = firstNode;
    int currentIndex = 0;

    while (currentNode != null) {
      if (currentIndex == index) {
        return currentNode.getData();
      }
      currentNode = currentNode.getNextNode();
      currentIndex++;
    }

    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
  }

  // remove data element from List at index
  public D remove(int index) {
    if (index < 0 || firstNode == null) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    // Sonderfall: erstes Element entfernen
    if (index == 0) {
      Node toRemove = firstNode;
      firstNode = toRemove.getNextNode();
      size--;
      return toRemove.getData();
    }

    Node previousNode = firstNode;
    int currentIndex = 0;

    // Vorgänger-Knoten des zu entfernenden Elements suchen
    while (currentIndex < index - 1) {
      if (previousNode.getNextNode() == null) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
      }
      previousNode = previousNode.getNextNode();
      currentIndex++;
    }

    Node nodeToRemove = previousNode.getNextNode();
    if (nodeToRemove == null) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    previousNode.setNextNode(nodeToRemove.getNextNode());
    size--;
    return nodeToRemove.getData();
  }


  private class Node {
    private D data;
    private Node nextNode;

    Node(D data){
      this.data = data;
      this.nextNode = null;
    }

    void setNextNode(Node nextNode){
      this.nextNode = nextNode;
    }

    Node getNextNode(){
      return this.nextNode;
    }

    D getData(){
      return this.data;
    }
  }


}
