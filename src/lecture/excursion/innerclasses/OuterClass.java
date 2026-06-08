package lecture.excursion.innerclasses;

import lecture.chapter7.Hotel;

public class OuterClass {

  private static String staticId = "Static ID: 4711";

  private String objectId;

  // Inner Static nested Class
  public static class InnerStaticClass {
    void printMessage(String message){
      System.out.println("Message from InnerStaticClass: " + message + " - Static ID: " + staticId);
    }
  }

  // Inner Element Class
  public class InnerElementClass {
    void printMessage(String message){
      System.out.println("Message from InnerElementClass: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId);
    }
  }

  public OuterClass(String objectId) {
    this.objectId = objectId;
  }

  public void printFromInnerLocalClass(String messageText){

    class InnerLocalClass{
      void printMessage(String message){
        System.out.println("Message from InnerLocalClass: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId);
      }
    }

    InnerLocalClass innerLocalObject = new InnerLocalClass();
    innerLocalObject.printMessage(messageText);

  }

  void printMessage(String message){
    System.out.println("Message from OuterClass: " + message);
  }

  static void main() {
    OuterClass outerClass = new OuterClass("Object ID: 4711");
    OuterClass secondOuterClass = new OuterClass("Object ID: 5813");

    String messageText = "Das ist unsere Nachricht aus den Klassen!";

    outerClass.printMessage(messageText);

    // Inner Static nexted Class
    OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
    innerStaticClass.printMessage(messageText);

    // Inner Element Class
    OuterClass.InnerElementClass innerElementObject = outerClass.new InnerElementClass();
    OuterClass.InnerElementClass secondInnerElementObject = secondOuterClass.new InnerElementClass();

    innerElementObject.printMessage(messageText);
    secondInnerElementObject.printMessage(messageText);


    outerClass.printFromInnerLocalClass(messageText);
    secondOuterClass.printFromInnerLocalClass(messageText);

  }
}
