package lecture.chapter9;

import lecture.chapter5.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

  static void main() {

    List list = new ArrayList();

    list.add("Banane"); // Index 0
    list.add("Daniel");     // Index 1
    list.add(new Car());    // Index 2
    list.add(3.14);

    // Element am Index löschen
    list.remove(1);

    // Element am Index überschreiben
    list.set(0, "Apple");

    // Element am Index hinzufügen
    list.add(3, "Banane");

    // Element an Index auslesen
    System.out.println("Element an Index 3: " + list.get(3));

    // Durch Liste iterieren
    System.out.println("Ausgabe der Liste mit wahlfreie Zugriff:");
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }


    // Durch Liste iterieren - for each
    System.out.println("Ausgabe der Liste mit for-each:");
    for(Object currentObject : list){
      /* --> Keine Modifikationen der Liste während einer for-each Iteration

      if(currentObject.equals("Apple")){
        list.remove(currentObject);
      }

       */
      System.out.println(currentObject);
    }


    // Durch Liste iterieren - Iterator
    System.out.println("Ausgabe der Liste mit Iterator:");
    Iterator listIterator = list.iterator();
    while(listIterator.hasNext()){
      Object currentElement = listIterator.next();
      if(currentElement.equals("Apple")){
        //list.remove(currentElement);
        listIterator.remove();
      }else {
        System.out.println(currentElement);
      }
    }

    System.out.println("Aktuelle Anzahl Elemente: " +  list.size());


    // Nutzen von Generics zur Typisierung
    List<String> textList = new ArrayList<String>();

    textList.add("Banane");
    textList.add("Daniel");
    textList.add("Apple");
    textList.add("Banane");
    textList.add("Daniel");
    textList.add("Apple");
    //textList.add(new Car());

    String currentText = textList.get(0);

    for(String currentText2 : textList){
      System.out.println(currentText2.length());
      System.out.println(currentText2);
    }


    // Nutzung von Wrapper Klassen
    List<Double> doubleValues = new ArrayList<Double>();

    // auto-boxing
    doubleValues.add(1.0);
    doubleValues.add(2.0);
    doubleValues.add(Double.valueOf(3.0));

    // Integer ==> int
    // Double ==> double
    // Float ==> float
    // Boolean ==> boolean

    // auto-unboxing
    double currentValue = doubleValues.get(0);



  }
}
