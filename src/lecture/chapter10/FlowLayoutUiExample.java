package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutUiExample extends JFrame {

  private FlowLayoutUiExample() {
    super("FlowLayout Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new FlowLayout(FlowLayout.CENTER));
    this.add(new JLabel("Bitte Text eingeben: "));
    this.add(new JTextField(40));
    this.add(new JButton("Abschicken"));

    this.pack();
    this.setVisible(true);

  }

  static void main() {
    new FlowLayoutUiExample();
  }
}
