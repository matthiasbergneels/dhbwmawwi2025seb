package lecture.chapter6.subpackage;

import lecture.chapter6.Animal;
import lecture.chapter6.Dog;
import lecture.chapter6.Fish;

public class MyLittlerSubPackageFarm {

    public static void main(String[] args) {

      /*
      Animal myAnimal = new Animal(15.5f, 20.0f, "Tierhalt");

      myAnimal.breath();
      myAnimal.move();
      myAnimal.eat();
      IO.println(myAnimal.toString());
      // IO.println(myAnimal.description); --> protected

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

    }

}
