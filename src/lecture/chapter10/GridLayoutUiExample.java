package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutUiExample extends JFrame {

  private GridLayoutUiExample(){
    super("GridLayout Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new GridLayout(0,2));
    this.add(new JButton("Button 1"));
    this.add(new JButton("Button 2"));
    this.add(new JButton("Button 3"));
    this.add(new JButton("Button 4"));

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    panel.add(new JButton("Button 5"));

    this.add(panel);
    this.add(new JButton("Button 6"));
    this.add(new JButton("Button 7"));
    this.add(new JTextField(40));

    this.pack();
    this.setVisible(true);
  }

  static void main() {
    new GridLayoutUiExample();
  }
}
