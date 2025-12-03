package lecture.chapter6.subpackage;

import lecture.chapter6.Animal;

public class Horse extends Animal {


  public Horse(float size, float weight, String description) {
    super(size, weight, description);
  }

  public void gallop(){
    IO.println("Das Pferd " + description + " gallopiert!!");
  }
}
