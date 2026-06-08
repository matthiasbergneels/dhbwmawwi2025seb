package lecture.chapter9;

import java.sql.Array;
import java.util.*;

public class SetExamples {

  static void main() {

    Set<String> fruits = new TreeSet<>();

    fruits.add("Apfel");
    fruits.add("Banane");
    fruits.add("Kirsche");
    fruits.add("Orange");
    fruits.add("Birne");
    fruits.add("Erdbeere");
    fruits.add("Melone");

    for(String fruit : fruits) {
      System.out.println(fruit);
    }


    Set<Integer> numbers = new TreeSet<>();
    numbers.add(10);
    numbers.add(28);
    numbers.add(13);
    numbers.add(73);
    numbers.add(57);
    numbers.add(67);
    numbers.add(-67);

    for(int number : numbers) {
      System.out.println(number);
    }


    Set<Student> students = new TreeSet<>();

    students.add(new Student(4711, "Müller", "Gabi", 23));
    students.add(new Student(3172, "Mayer", "Rudolf", 28));
    students.add(new Student(7312, "Schmidt", "Gertrude", 21));
    students.add(new Student(7312, "Adam", "Gertrude", 21));
    students.add(new Student(8712, "Adam", "Gertrude", 21));
    students.add(new Student(3172, "Mayer", "Rudolf", 28));
    students.add(new Student(6392, "Müller", "Franz", 25));
    students.add(new Student(3172, "Zeus", "Mechtild", 21));

    System.out.println("Students by natürlicher Ordnung:");
    System.out.println("Anzahl Students: " + students.size());
    for(Student student : students) {
      System.out.println(student);
    }

    Set<Student> studentsByName = new TreeSet<>(new StudentSortedByName());
    studentsByName.addAll(students);

    System.out.println("Students by Name:");
    System.out.println("Anzahl Students: " + studentsByName.size());
    for(Student student : studentsByName) {
      System.out.println(student);
    }

    System.out.println("Students by Age:");
    System.out.println("Anzahl Students: " + studentsByName.size());
    List<Student> studentListSortedbyAge = new ArrayList();
    studentListSortedbyAge.addAll(students);
    Collections.sort(studentListSortedbyAge, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
      }
    });
    for(Student student : studentListSortedbyAge) {
      System.out.println(student);
    }


  }
}
