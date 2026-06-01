package lecture.chapter9;

import lecture.chapter5.Car;

import java.util.*;

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




    // Beispiel 1: Löschen während Iteration --> Element wird übersprungen
    List<String> deleteList = new ArrayList<String>();
    deleteList.add("Banane");
    deleteList.add("Apple");
    deleteList.add("Kirsche");
    deleteList.add("Mango");

    System.out.println("Iteration mit Löschen (Kirsche wird übersprungen):");
    for (int i = 0; i < deleteList.size(); i++) {
      String current = deleteList.get(i);
      if (current.equals("Apple")) {
        deleteList.remove(i); // entfernt "Apple" an i=1, "Kirsche" rückt auf i=1 vor --> i++ überspringt sie
      } else {
        System.out.println(current);
      }
    }
    // Ausgabe: Banane, Mango  (Kirsche wird übersprungen)

    // Beispiel 2: Einfügen während Iteration --> Element wird doppelt ausgegeben
    List<String> insertList = new ArrayList<String>();
    insertList.add("Banane");
    insertList.add("Apple");
    insertList.add("Kirsche");

    /* --> Achtung: Endlosschleife!
    System.out.println("Iteration mit Einfügen (Apple wird doppelt ausgegeben):");
    for (int i = 0; i < insertList.size(); i++) {
      String current = insertList.get(i);
      System.out.println(current);
      if (current.equals("Banane")) {
        insertList.add(i, "Neu"); // schiebt "Banane" auf i+1 --> wird nächste Runde nochmal gelesen
      }
    }
    // Ausgabe: Banane, Banane, Apple, Kirsche  (Banane erscheint zweimal, obwohl nur einmal eingefügt)
     */



    // Sorting Lists

    List<Student> students = new ArrayList<>();

    students.add(new Student(4711, "Müller", "Gabi", 23));
    students.add(new Student(3172, "Mayer", "Rudolf", 28));
    students.add(new Student(7312, "Schmidt", "Gertrude", 21));
    students.add(new Student(7312, "Adam", "Gertrude", 21));
    students.add(new Student(8712, "Adam", "Gertrude", 21));
    students.add(new Student(3172, "Mayer", "Rudolf", 28));
    students.add(new Student(6392, "Müller", "Franz", 25));
    students.add(new Student(3172, "Zeus", "Mechtild", 21));

    System.out.println("Students ArrayList: ");
    for(Student student : students){
      System.out.println(student);
    }

    // Sortin by natural Order
    Collections.sort(students);

    System.out.println("Students ArrayList - natural Order: ");
    for(Student student : students){
      System.out.println(student);
    }

    Collections.sort(students, new StudentSortedByName());
    System.out.println("Students ArrayList - by Name: ");
    for(Student student : students){
      System.out.println(student);
    }


  }
}
