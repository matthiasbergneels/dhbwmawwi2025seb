package lecture.chapter6;

public class Fish extends Animal {

  private boolean isSaltWater;

  public Fish(float size, float weight, String description,  boolean isSaltWater) {
    super(size, weight, description);
    this.isSaltWater = isSaltWater;
  }

  public void bubble(){
    IO.println("Der Fish " + getDescription() + " blubbert! *blubblub*");
  }

  public boolean isSaltWater() {
    return isSaltWater;
  }

  public void setSaltWater(boolean saltWater) {
    isSaltWater = saltWater;
  }
}
