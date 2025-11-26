package lecture.chapter5;

public class Student {

  private int id;
  private String firstName;
  private String lastName;

  public Student(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void drink(float amount){
    IO.println(firstName + " trink " + amount + "l");
  }

  public void drink(float amount, int coffeinInMg){
    this.drink(amount);
    IO.println("und wird wach!!!!!");
  }

  public String drink(float amount, double alcoholInPercentage){
    this.drink(amount);
    IO.println("und betrunken!!!!!!!!!!");
    return "besoofen";
  }

  public void drink(double amountOfPoison, float amount){
    this.drink(amount);
    IO.println("und betrunken!!!!!!!!!!");
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
