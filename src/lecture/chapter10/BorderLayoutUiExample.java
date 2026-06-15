package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutUiExample extends JFrame {

    private BorderLayoutUiExample(){
      super("BorderLayout Example");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.setLayout(new BorderLayout());
      this.add(new JButton("North"), BorderLayout.NORTH);
      this.add(new JButton("South"), BorderLayout.SOUTH);
      this.add(new JButton("West"), BorderLayout.WEST);
      this.add(new JButton("Center"), BorderLayout.CENTER);

      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.LEFT));
      panel.add(new JButton("East"));
      this.add(panel, BorderLayout.EAST);


      this.pack();
      this.setVisible(true);
    }

    static void main() {
      new BorderLayoutUiExample();
    }
}
