package lecture.chapter9;

public class EqualsAndCompareToConsistency {

  static void main() {
    Student s1 = new Student(4711, "Müller", "Gabi", 23);
    Student s2 = new Student(3172, "Mayer", "Rudolf", 28);
    Student s3 = new Student(3172, "Mayer", "Rudolf", 28);
    Student s4 = s2;

    System.out.println("s1 compareTo s2: " + s1.compareTo(s2)); // > 0
    System.out.println("s2 compareTo s3: " + s2.compareTo(s3)); // 0
    System.out.println("s2 compareTo s3: " + s2.compareTo(s4)); // 0

    System.out.println("s1 equals s2: " + s1.equals(s2)); // false
    System.out.println("s2 equals s3: " + s2.equals(s3)); // true
    System.out.println("s2 equals s3: " + s2.equals(s4)); // true

  }


}
