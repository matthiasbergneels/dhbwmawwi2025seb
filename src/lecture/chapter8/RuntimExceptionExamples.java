package lecture.chapter8;

public class RuntimExceptionExamples {

  static void main() {

    String[] fruits = {"Banane", "Apfel", "Orange"};

    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }

    /*
    try {
      for (int i = 0; i <= fruits.length; i++) {
        System.out.println(fruits[i]);
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
      System.out.println("Zu viel gewollt - kein Obst mehr für dich!");
    }

     */

    String text = null;

    try {
      if (text.length() > 5) {
        System.out.println("TL;DR");
      }
    }catch (NullPointerException e){
      System.out.println("Schreib zumindest irgendwas!");
    }

    System.out.println("Programm Ende");
  }
}
