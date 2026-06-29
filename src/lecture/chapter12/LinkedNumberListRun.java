package lecture.chapter12;

public class LinkedNumberListRun {

  static void main() {

    LinkedNumberList aLotOfNumbers = new LinkedNumberList();

    System.out.println("Linked List Element Count: " + aLotOfNumbers.size());

    aLotOfNumbers.add(99);
    aLotOfNumbers.add(5);
    aLotOfNumbers.add(20);

    System.out.println("Linked List Element Count: " + aLotOfNumbers.size());

    aLotOfNumbers.add(66);
    aLotOfNumbers.add(182);
    aLotOfNumbers.add(981);

    System.out.println("Linked List Element Count: " + aLotOfNumbers.size());

    aLotOfNumbers.printList();

    System.out.println("Element at 2: " + aLotOfNumbers.get(2));
    System.out.println("Element at 0: " + aLotOfNumbers.get(0));
    System.out.println("Element at 10: " + aLotOfNumbers.get(10));

  }
}
