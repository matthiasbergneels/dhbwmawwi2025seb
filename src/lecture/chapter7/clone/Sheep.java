package lecture.chapter7.clone;

public class Sheep implements Cloneable {

  private String name;
  private int age;

  public Sheep(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Sheep [age=" + age + ", name=" + name + "]";
  }

  @Override
  public Sheep clone() throws CloneNotSupportedException {
    Sheep clonedSheep = (Sheep)super.clone();
    clonedSheep.age = 0;
    return clonedSheep;
  }
}
