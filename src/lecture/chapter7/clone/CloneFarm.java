package lecture.chapter7.clone;

public class CloneFarm {

  public static void main(String[] args) throws CloneNotSupportedException {

    Sheep dolly = new Sheep(5, "Dolly");

    Sheep dollyClone = dolly.clone();

    IO.println(dolly);
    IO.println(dollyClone);

    dolly.setAge(6);

    IO.println(dolly);
    IO.println(dollyClone);


  }
}
