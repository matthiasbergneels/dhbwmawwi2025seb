package lecture.chapter6;

import lecture.chapter6.subpackage.Horse;

public class MyLittleFarm {

  public static void main(String[] args) {

    /*
    Animal myAnimal = new Animal(15.5f, 20.0f, "Tierhalt");

    myAnimal.breath();
    myAnimal.move();
    myAnimal.eat();
    IO.println(myAnimal.toString());
    IO.println(myAnimal);
    IO.println(myAnimal.description);
     */

    Dog myDog = new Dog(75.0f, 73.0f, "Bello", "Broholmer");

    myDog.breath();
    myDog.move();
    myDog.eat();
    myDog.eat(1.5f);
    myDog.bark();
    IO.println(myDog.toString());


    Fish myFish = new Fish(0.1f, 10, "Nemo", true);

    myFish.breath();
    myFish.move();
    myFish.eat();
    myFish.bubble();
    IO.println(myFish.toString());


    Animal myAnimal;

    // Narrowing Cast --> Narrowing Cast
    myAnimal = myDog;
    myAnimal.move();
    myAnimal.breath();
    // myAnimal.bark();
    myAnimal = myFish;
    myAnimal.move();
    myAnimal.breath();
    // myAnimal.bubble();

    // Widening Cast --> Erweitert die Sichtbarkeit
    Fish secondFish = (Fish)myAnimal;

    secondFish.move();
    secondFish.bubble();



    Animal[] animalBox = new Animal[5];

    animalBox[0] = myDog;
    animalBox[1] = myFish;
    animalBox[2] = new Dog(75.0f, 73.0f, "Hasso", "Schäferhund");
    animalBox[3] = new Fish(0.1f, 10, "Barsch", true);
    animalBox[4] = new Fish(0.1f, 10, "Snapper", true);

    // Farmer - keeping animals alive
    for(Animal animal : animalBox) {
      animal.move();
      animal.breath();
      animal.eat();

      if(animal instanceof Dog) {
        Dog currentDog = (Dog) animal;
        currentDog.bark();
      }
    }





  }

}
