package excersises.chapter8;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1 {
  public static void main(String[] args) {

    FileWriter datei = null;
    String text;

    try {
      datei = new FileWriter("ausgabe.txt");

      text = "1\n";

      for (int i = 2; i <= 100; i++) {
        text += i;
        text += "\n";
      }

      datei.write(text, 0, text.length());
      datei.flush();

    }catch(IOException ioException){
      System.out.println("Fehler beim Bearbeiten der Datei!");
    } finally {

      try {
        datei.close();
      } catch (IOException e) {
        System.out.println("Fehler beim Schließen der Datei!");
      }

    }

    System.out.println("Programm beendet!");

  }
}