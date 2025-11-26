package lecture.chapter5;

import java.lang.invoke.StringConcatFactory;

public class Car {

  // Instanz-Attribute
  private String color;
  private int hp = 150;
  private String licensePlate;
  private double currentSpeed;
  public final CarBrand brand;

  // Klassen-Attribute
  private static int carCount = 0;

  // Konstruktor
  public Car(String color, int hp, String licensePlate, CarBrand brand) {
    // Objekt-Selbstreferenz "this" wird genutzt um auf die Attribute zuzugreifen (bei Namenskonflikten)
    this.setColor(color);
    this.setHp(hp);
    this.licensePlate = licensePlate;
    this.brand = brand;

    this.currentSpeed = 0.0;

    carCount++;
  }

  public Car(String brand, int hp){
    this(brand, hp, "XX-YY 1234", CarBrand.BMW);
  }

  public Car(){
    this("Schwarz", 150, "XX-YY 1234", CarBrand.KIA);
  }

  // Instanz-Methoden
  // Aufbau einer Methode [Modifier] Rückgabetyp Methodenname([Parameterliste])

  void accelerate(double deltaSpeed){
    currentSpeed =  currentSpeed + deltaSpeed;
  }

  double brake(){
    currentSpeed = currentSpeed - 5.0;
    return currentSpeed;
  }

  void fullBrake(){
    currentSpeed = 0;
  }


  // Getter / Setter Methoden

  public String getColor(){
    return color;
  }

  public int getHp(){
    return hp;
  }

  public String getLicensePlate(){
    return licensePlate;
  }

  public double getCurrentSpeed(){
    return currentSpeed;
  }

  public void setColor(String color){
    // Plausibilitiätsprüfung
    if(color.equals("Rot") || color.equals("Blau") || color.equals("Schwarz") || color.equals("Pink")){
      this.color = color;
    } else {
      this.color = "Schwarz";
    }
  }

  public void setHp(int hp){
    // Plausibilitiätsprüfung
    if(hp > 0 &&  hp <= 800){
      this.hp = hp;
    }else {
      this.hp = 150;
    }
  }

  public void setLicensePlate(String licensePlate){
    this.licensePlate = licensePlate;
  }

  /* --> Depricated -> vor Java 18 für Aufräumarbeiten vor dem Garbage Collector
  @Override
  protected void finalize() {
    System.out.println("Auto der Marke " + this.brand + " wird verschrottet!");
    carCount--;
  }
   */


  // Klassen-Methoden
  public static int getCarCount(){
    return  carCount;
  }

  public static void printCarInformation(Car currentCar){
    System.out.println("========= Auto Information =========");
    System.out.println("Farbe: " + currentCar.color);
    System.out.println("Marke: " + currentCar.brand);
    System.out.println("Nummernschild: " + currentCar.licensePlate);
    System.out.println("Leistung: " + currentCar.hp);
  }
}
