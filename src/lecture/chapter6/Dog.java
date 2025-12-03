package lecture.chapter6;

public final class Dog extends Animal {

  private String breed;

  public Dog(float size, float weight, String description,  String breed) {
    super(size, weight, description);
    this.breed = breed;
  }

  @Override
  public void breath() {
    IO.println("Der Hund " + description + " atmet! *hechelhechel*");
  }

  @Override
  public void eat(){
    super.eat();
    IO.println("ganz viel Fleisch!");
  }

  /* --> final move Methode in Animal kann nicht überschrieben werden
  @Override
  public void move(){

  }
   */

  // Überladene Methode aus Animal
  public void eat(float amount){
    super.eat();
    IO.println(amount + " kg Fleisch!");
  }


  public void bark(){
    IO.println("Der Hund " + getDescription() + " bellt!! *wauwau*");
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return super.toString() + ", Rasse " + breed ;
  }
}
