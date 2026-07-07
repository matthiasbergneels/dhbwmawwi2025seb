package lecture.chapter12;

public class StackRun {

  static void main() {

    Stack<String> fruitStack = new Stack<String>();

    fruitStack.push("Apple");
    fruitStack.push("Banana");
    fruitStack.push("Cherry");
    fruitStack.push("Mango");

    System.out.println("Stack size: " + fruitStack.size());
    System.out.println("Top element (peek): " + fruitStack.peek());
    System.out.println();

    while (!fruitStack.isEmpty()) {
      System.out.println("pop: " + fruitStack.pop());
    }

    System.out.println("Stack empty: " + fruitStack.isEmpty());

  }

}