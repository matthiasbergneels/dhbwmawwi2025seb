package lecture.chapter5.subpackage;

import lecture.chapter5.Car;

public class CarRunDifferentPackage {

  public static void main(String[] args) {

    Car myCar = new Car("Red", 1500, "Red", "Red");

    IO.println(myCar.brand);

  }
}
