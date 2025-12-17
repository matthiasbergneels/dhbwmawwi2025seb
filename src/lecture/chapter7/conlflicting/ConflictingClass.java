package lecture.chapter7.conlflicting;

public class ConflictingClass implements Aable, Bable{

   public final static String STUPID_CONSTANT = "Studip class Stuff";

  public static void main(String[] args) {
    ConflictingClass conflictingClass = new ConflictingClass();

    IO.println("Aable Konstante: " + Aable.STUPID_CONSTANT);
    IO.println("Bable Konstante: " + Bable.STUPID_CONSTANT);
    IO.println("ConflictingClass Konstante: " + conflictingClass.STUPID_CONSTANT); //--> Syntax Error because of naming conflict

    conflictingClass.printStupidThings();
  }

  @Override
  public void printStupidThings() {
    Aable.super.printStupidThings();
    Bable.super.printStupidThings();
  }
}
