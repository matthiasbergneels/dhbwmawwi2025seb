package lecture.chapter12;

public class QueueRun {

  static void main() {

    Queue<String> fruitQueue = new Queue<>();

    fruitQueue.enqueue("Apple");
    fruitQueue.enqueue("Banana");
    fruitQueue.enqueue("Cherry");
    fruitQueue.enqueue("Mango");

    System.out.println("Queue size: " + fruitQueue.size());
    System.out.println();

    while (!fruitQueue.isEmpty()) {
      System.out.println("dequeue: " + fruitQueue.dequeue());
    }

    System.out.println("Queue empty: " + fruitQueue.isEmpty());

  }

}