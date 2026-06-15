package lecture.chapter10;

import javax.swing.*;

public class MyFirstUi {

  static void main() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    JButton button = new JButton("Click Me");
    frame.add(button);
    //frame.getContentPane().add
    JLabel label = new JLabel("Hello World");
    frame.add(label);

    frame.pack();
    frame.setVisible(true);
  }

}
