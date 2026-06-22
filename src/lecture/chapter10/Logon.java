package lecture.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Logon extends JFrame {

  private final String ACTION_LOGIN = "ACTION_LOGIN";
  private final String ACTION_LOGOUT = "ACTION_LOGOUT";

  // Instanzattribute
  private JFormattedTextField portField = null;

  private Logon() throws ParseException {
    super();
    this.setTitle("Logon");
    this.setResizable(false);

    JComboBox<String> myComboBox = new JComboBox<>(new String[]{"SSH", "FTP", "HTTP", "HTTPS"});

    // ItemListener as Lambda Function
    myComboBox.addItemListener((e)->{
      if(e.getStateChange() == ItemEvent.SELECTED) {
        System.out.println("Item zustand der ComboBox hat sich geändert!");
        System.out.println("Zustandsänderung: " + e.getStateChange());
        System.out.println("Item: " + e.getItem());
        System.out.println("Parameter String: " + e.paramString());

        switch((String) e.getItem()){
          case "FTP":
            portField.setText("21");
            break;
          case "HTTP":
            portField.setText("80");
            break;
        }
      }
    });

    /*
    // ItemListener as inner anonymous Class
    myComboBox.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
          System.out.println("Item zustand der ComboBox hat sich geändert!");
          System.out.println("Zustandsänderung: " + e.getStateChange());
          System.out.println("Item: " + e.getItem());
          System.out.println("Parameter String: " + e.paramString());

          switch((String) e.getItem()){
            case "FTP":
              portField.setText("21");
              break;
            case "HTTP":
              portField.setText("80");
              break;
          }
        }
      }
    });
 */

    portField = new JFormattedTextField(new MaskFormatter("#####"));
    portField.setColumns(3);

    // initialize Panels
    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel southPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());

    JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
    JPanel filePanel = new JPanel(new GridLayout(0, 2));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

    //create and assign elements for connection area
    JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("User:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField userNameField = new JTextField(3);
    flowLayoutForCell.add(userNameField);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Passwort:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JPasswordField userPasswordField = new JPasswordField(3);
    flowLayoutForCell.add(userPasswordField);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Art:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(myComboBox);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Host:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField host = new JTextField(5);
    flowLayoutForCell.add(host);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Port:"));
    connectionPanel.add(flowLayoutForCell);
    connectionPanel.add(portField);

    // create and add Fields for File Area
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Quelle:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Ziel:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);

    // create & assign Buttons
    JButton okButton = new JButton("Login");
    okButton.setActionCommand(ACTION_LOGIN);
    JButton cancelButton = new JButton("Beenden");
    cancelButton.setActionCommand(ACTION_LOGOUT);

    /*
    okButton.addActionListener((e)->{
      System.out.println("Portfeld Wert: " + portField.getText());
    });

    cancelButton.addActionListener((e)->{
      System.out.println("Beenden");
      System.exit(0);
    });
     */

    ActionListener buttonListener = (e)-> {
      System.out.println("Parameter String: " + e.paramString());
      System.out.println("Action Command: " + e.getActionCommand());
      System.out.println("Timestamp: " + e.getWhen());
      System.out.println("Modifiers: " + e.getModifiers() + " - " + Integer.toBinaryString(e.getModifiers()));

      if(e.getActionCommand().equals(ACTION_LOGIN)) {
        System.out.println("Portfeld Wert: " + portField.getText());
      }else if(e.getActionCommand().equals(ACTION_LOGOUT)) {
        System.exit(0);
      }
    };

    MouseListener mouseListener = new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {

      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("Über Button: " + e.getSource());
      }

      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("Weg vom Button: " + e.getSource());
      }
    };

    //okButton.addMouseListener(mouseListener);
    //cancelButton.addMouseListener(mouseListener);
    okButton.addActionListener(buttonListener);
    cancelButton.addActionListener(buttonListener);


    southPanel.add(okButton);
    southPanel.add(cancelButton);

    // create and assign Borders
    Border etchedBorder = BorderFactory.createEtchedBorder();
    Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
    Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
    Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

    connectionPanel.setBorder(connectionBorder);
    filePanel.setBorder(fileBorder);
    centerPanel.setBorder(centerBorder);

    // combine Panels
    centerPanel.add(connectionPanel);
    centerPanel.add(filePanel);

    mainPanel.add(centerPanel, BorderLayout.CENTER);
    mainPanel.add(southPanel, BorderLayout.SOUTH);

    this.add(mainPanel);

    JMenuBar swingMenuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem printItem = new JMenuItem("Print");
    printItem.setActionCommand(ACTION_LOGIN);
    printItem.addActionListener(buttonListener);
    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.setActionCommand(ACTION_LOGOUT);
    exitItem.addActionListener(buttonListener);

    fileMenu.add(printItem);
    fileMenu.add(exitItem);

    swingMenuBar.add(fileMenu);

    this.setJMenuBar(swingMenuBar);

    MenuBar awtMenuBar = new MenuBar();
    Menu awtFileMenu = new Menu("File");
    MenuItem awtPrintItem = new MenuItem("Print");
    awtPrintItem.setActionCommand(ACTION_LOGIN);
    awtPrintItem.addActionListener(buttonListener);
    MenuItem awtExitItem = new MenuItem("Exit");
    awtExitItem.setActionCommand(ACTION_LOGOUT);
    awtExitItem.addActionListener(buttonListener);

    awtFileMenu.add(awtPrintItem);
    awtFileMenu.add(awtExitItem);

    awtMenuBar.add(awtFileMenu);

    this.setMenuBar(awtMenuBar);



    // set JFrame behavior
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.pack();
  }

  public static void main(String[] args) throws ParseException{

    // using invokeLater for safe parallel processing
    SwingUtilities.invokeLater(() -> {
        JFrame logonUI = null;
        try {
          logonUI = new Logon();
          logonUI.setVisible(true);
        } catch (ParseException e) {
          throw new RuntimeException(e);
        }

        System.out.println("Starting UI-Frame - " + Thread.currentThread());
    });
    System.out.println("Added UI-Frame to starting queue - " + Thread.currentThread());
  }

}