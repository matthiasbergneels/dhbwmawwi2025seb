package lecture.chapter5.subpackage;

import lecture.chapter5.Car;
import lecture.chapter5.CarBrand;

public class CarRunDifferentPackage {

  public static void main(String[] args) {

    Car myCar = new Car("Red", 1500, "Red", CarBrand.VOLKSWAGEN);

    IO.println(myCar.brand);

  }
}
