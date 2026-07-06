package lecture.chapter12;

import lecture.chapter9.Student;

public class LinkedListRun {

  static void main() {

    LinkedList<String> words = new LinkedList<String>();
    words.add("Hello");
    words.add("all");
    words.add("funny");

    words.printList();

    words.remove(2);
    words.add("not");
    words.add("funny");
    words.printList();

    String firstIndex = words.get(2);
    System.out.println(firstIndex);

    LinkedList everything = new LinkedList();
    everything.add("Hello");
    everything.add(100);
    everything.add("all");
    everything.add(new Student(4711, "Müller", "Gabi", 23));

    everything.printList();


  }
}
