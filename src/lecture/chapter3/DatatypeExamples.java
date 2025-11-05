package lecture.chapter3;

public class DatatypeExamples {

  public static void main(String[] args) {

    // Declaration of int variable
    int numberA;

    // initialisation of int variable
    numberA = 123;

    long numberB = 1304;

    int numberC, numberD = 10, numberE;

    String firstName; // lowerCamelCase

    numberC = 100;
    System.out.println(numberC);


    // usage of constants
    final double VALUE_OF_PI = 3.14159;

    // PI = 5;

    final double VALUE_OF_E;
    VALUE_OF_E = 2.7;


    // integer literals

    int literalExampleA = 11;          // decimal literal --> 11 -> 11
    System.out.println(literalExampleA);

    literalExampleA = 011;          // octal literal --> 011 -> 9
    System.out.println(literalExampleA);

    literalExampleA = 0b11;             // binary literal --> 0b11 -> 3
    System.out.println(literalExampleA);

    literalExampleA = 0x11;             // binary literal --> 0x11 -> 17
    System.out.println(literalExampleA);

    final int RGB_RED = 0xFF0000;

    long extremLongNumber = 3_000_000_000L;


    
  }
}
