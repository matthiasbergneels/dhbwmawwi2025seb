package lecture.chapter7.conlflicting;

public interface Aable {

  String STUPID_CONSTANT = "Very Stupid";

  default void printStupidThings(){
    IO.println("Aable stupid stuff: " + STUPID_CONSTANT);
  }

}
