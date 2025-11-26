package lecture.chapter5;

public class CarRun {

  public static void main(String[] args) {

    System.out.println("Anzahl Autos: " + Car.getCarCount());

    Car myCar = new Car("Blau", 200, "HD-AB 1234", CarBrand.VOLKSWAGEN);
    Car yourCar = new Car("Kackbraun", 500, "MA-BA 6789", CarBrand.PORSCHÉ);

    /*
    myCar.color = "Blau";
    myCar.licensePlate = "HD-AB 1234";
    myCar.currentSpeed = 50;
    myCar.brand = "Volkswagen";

    yourCar.color = "Schwarz";
    yourCar.brand = "Porsché";
     */

    /*
    myCar.color = "kackbraun";
    myCar.currentSpeed =  1500;
    myCar.hp = 999;
    myCar.currentSpeed =  -500;
  */

    myCar.setColor("Kackbraun");

    IO.println("Mein Auto ist ein " + myCar.brand + "(" + myCar.brand.getPriceClass() + ") in der Farbe " + myCar.getColor());
    IO.println("Dein Auto ist ein " + yourCar.brand + "(" + yourCar.brand.getPriceClass() + ") in der Farbe " + yourCar.getColor());



    myCar.accelerate(15);
    yourCar.accelerate(15);
    IO.println("Aktuelle Geschwindigkeit von meinem Auto: " + myCar.getCurrentSpeed());
    IO.println("Aktuelle Geschwindigkeit von deinem Auto: " + yourCar.getCurrentSpeed());
    myCar.brake();
    myCar.brake();
    double currentSpeed = myCar.brake();
    IO.println("Aktuelle Geschwindigkeit von meinem Auto: " + myCar.getCurrentSpeed());
    IO.println("Aktuelle Geschwindigkeit von deinem Auto: " + yourCar.getCurrentSpeed());
    myCar.fullBrake();
    IO.println("Aktuelle Geschwindigkeit von meinem Auto: " + myCar.getCurrentSpeed());
    IO.println("Aktuelle Geschwindigkeit von deinem Auto: " + yourCar.getCurrentSpeed());


    System.out.println("Anzahl Autos: " + Car.getCarCount());

    new Car();
    new Car();
    new Car();
    new Car();

    Car.printCarInformation(myCar);
    Car.printCarInformation(yourCar);



    System.out.println("Anzahl Autos: " + Car.getCarCount());

  }
}
