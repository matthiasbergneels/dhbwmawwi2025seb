package lecture.chapter9;

import java.util.Objects;

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
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

  @Override
  public boolean equals(Object obj) {
    // Alias Check
    if(this == obj) {
      return true;
    }

    // Null Check
    if(obj == null){
      return false;
    }

    // Type Check
    if(this.getClass() != obj.getClass()) {
      return false;
    }

    // Attribute check
    Student studentObj = (Student)obj;

    if(this.id !=  studentObj.id) {
      return false;
    }

    if(!this.familyName.equals(studentObj.familyName)) {
      return false;
    }

    if(!this.firstName.equals(studentObj.firstName)) {
      return false;
    }

    return this.age == studentObj.age;
  }

/*
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;
    return id == student.id && age == student.age && Objects.equals(familyName, student.familyName) && Objects.equals(firstName, student.firstName);
  }
 */

  @Override
  public int hashCode() {
    return this.id ^ this.familyName.hashCode() ^ this.firstName.hashCode() ^ this.age;
  }

/*
  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + Objects.hashCode(familyName);
    result = 31 * result + Objects.hashCode(firstName);
    result = 31 * result + age;
    return result;
  }

 */
}
