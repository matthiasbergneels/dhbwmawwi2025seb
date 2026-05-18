package lecture.chapter9;

public class Student implements Comparable<Student> {

  private int id;
  private String familyName;
  private String firstName;
  private int age;

  public Student(int id, String familyName, String firstName, int age) {
    this.id = id;
    this.familyName = familyName;
    this.firstName = firstName;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", familyName='" + familyName + '\'' +
      ", firstName='" + firstName + '\'' +
      ", age=" + age +
      '}';
  }

  @Override
  public int compareTo(Student o) {
    if(this.id !=  o.id) {
      return this.id - o.id;
    }

    if(!this.familyName.equals(o.familyName)) {
      return this.familyName.compareTo(o.familyName);
    }

    if(!this.firstName.equals(o.firstName)) {
      return this.firstName.compareTo(o.firstName);
    }

    return this.age - o.age;
  }
}
