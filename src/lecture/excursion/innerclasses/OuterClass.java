package lecture.excursion.innerclasses;

import lecture.chapter7.Hotel;

public class OuterClass {

  interface Printable{
    void printMessage(String message);
  }

  private static String staticId = "Static ID: 4711";

  private String objectId;

  // Inner Static nested Class
  public static class InnerStaticClass {
    void printMessage(String message){
      System.out.println("Message from InnerStaticClass: " + message + " - Static ID: " + staticId + " - ClassContext: " + this.getClass().getName());
    }
  }

  // Inner Element Class
  public class InnerElementClass {
    void printMessage(String message){
      System.out.println("Message from InnerElementClass: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId + " - ClassContext: " + this.getClass().getName());
    }
  }

  public OuterClass(String objectId) {
    this.objectId = objectId;
  }

  public void printFromInnerLocalClass(String messageText){

    class InnerLocalClass{
      void printMessage(String message){
        System.out.println("Message from InnerLocalClass: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId + " - ClassContext: " + this.getClass().getName());
      }
    }

    InnerLocalClass innerLocalObject = new InnerLocalClass();
    innerLocalObject.printMessage(messageText);

  }

  public void printFromSecondInnerLocalClass(String messageText){

    class InnerLocalClass{
      void printMessage(String message){
        System.out.println("Message from InnerLocalClass: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId + " - ClassContext: " + this.getClass().getName());
      }
    }

    InnerLocalClass innerLocalObject = new InnerLocalClass();
    innerLocalObject.printMessage(messageText);

  }

  void printMessage(String message){
    System.out.println("Message from OuterClass: " + message + " - ClassContext: " + this.getClass().getName());
  }

  public void printFromInnerAnonymousClass(String messageText){
    Printable innerAnonymousObject = new Printable(){
      public void printMessage(String message){
        System.out.println("Message from InnerAnonymousClass: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId + " - ClassContext: " + this.getClass().getName());
      }
    };

    innerAnonymousObject.printMessage(messageText);
  }

  public void printFromLambdaFunction(String messageText){
    Printable lambdaFunction = (message) -> {
      System.out.println("Message from LambdaFunction: " + message + " - Object ID: " + objectId + " - Static ID: " + staticId + " - ClassContext: " + this.getClass().getName());
    };

    lambdaFunction.printMessage(messageText);
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

    outerClass.printFromInnerAnonymousClass(messageText);
    secondOuterClass.printFromInnerAnonymousClass(messageText);

    outerClass.printFromLambdaFunction(messageText);
    secondOuterClass.printFromLambdaFunction(messageText);

  }
}
