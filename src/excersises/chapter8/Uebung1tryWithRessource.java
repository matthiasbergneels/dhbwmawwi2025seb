package excersises.chapter8;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1tryWithRessource {
  public static void main(String[] args) {

    String text;

    try(FileWriter datei = new DebugFileWriter("ausgabe.txt")) {
        text = "1\n";

        for (int i = 2; i <= 100; i++) {
            text += i;
            text += "\n";
        }

        System.out.println("Werte in Datei schreiben");
        datei.write(text, 0, text.length());
        System.out.println("Werte in Datei flushen");
        datei.flush();
    }catch(IOException ioException){
      System.out.println("Fehler beim Bearbeiten der Datei!");
    }

    System.out.println("Programm beendet!");

  }
}