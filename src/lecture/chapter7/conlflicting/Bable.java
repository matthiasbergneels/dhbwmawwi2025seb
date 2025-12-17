package lecture.chapter7.conlflicting;

public interface Bable {

  String STUPID_CONSTANT = "Very very Stupid";

  default void printStupidThings() {
    IO.println("Bable stupid stuff: " + STUPID_CONSTANT);
  }
}