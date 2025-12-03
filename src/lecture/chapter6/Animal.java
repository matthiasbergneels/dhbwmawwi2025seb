package lecture.chapter6;

public abstract class Animal {

  private float size;
  private float weight;
  protected String description;


  public Animal(float size, float weight, String description) {
    this.size = size;
    this.weight = weight;
    this.description = description;
  }

  public abstract void breath();

  public void eat(){
    IO.println("Das Tier " + description + " frisst!");
  }

  public final void move(){
    IO.println("Das Tier " + description + " bewegt sich!");
  }


  public float getSize() {
    return size;
  }

  public void setSize(float size) {
    this.size = size;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public String toString() {
    return description + ", Gewicht " + weight + " kg, Größe " + size + " cm";
  }
}
