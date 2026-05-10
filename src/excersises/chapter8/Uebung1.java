package excersises.chapter8;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1 {
  public static void main(String[] args)  {
    String text;

    try (FileWriter datei = new FileWriter("ausgabe.txt")){

      text = "1\n";

      for(int i = 2; i <=100; i++){
        text += i;
        text += "\n";
      }

      datei.write(text, 0, text.length());
    }catch (IOException e){
      IO.println("Fehler bei der Verarbeitung der Datei: " + e.getMessage());
    }
  }

}