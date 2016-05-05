//Kara Schrader
//CS1 1337.0U1
//this program utilizes a JList, JComboBox, radio buttons, check boxes, and scroll panes. It lets
//the user select the type of car, color, 2/4 doors, cloth/leather seats, and a few add ons. The
//button at the bottom lets the user display the choices they have selected, and on a second click
//clears what they have selected so they can start over.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class CarPrice extends JFrame
{
    //create string array with car types and attach to jlist
    private static String[] carTypes = {"Toyota Prius","Honda Civic","Mercedes Benz","Mitsubishi Eclipse","Subaru Impreza","Dodge Charger","Lincoln MKS","Mercury Milan","Ford Fusian","Infiniti G35"};
    private static JList jlst = new JList(carTypes);
    
    //create panels
    private JPanel listPanel = new JPanel(new FlowLayout());
    private JPanel choosePanel = new JPanel(new BorderLayout());
    private JPanel panel = new JPanel();
    
    //create combo cox
    private JComboBox jcbo = new JComboBox();
    
    //create display label and button
    private JTextArea display = new JTextArea("");
    private JButton command = new JButton("Click to Display");
    
    //creates radio buttons
    private JRadioButton btn1 = new JRadioButton("2-door");
    private JRadioButton btn2 = new JRadioButton("4-door");
    private JRadioButton btn3 = new JRadioButton("Cloth seats");
    private JRadioButton btn4 = new JRadioButton("Leather seats");
    
    //create check boxes
    private JCheckBox check1 = new JCheckBox("Automatic Transmission");
    private JCheckBox check2 = new JCheckBox("Power Steering");
    private JCheckBox check3 = new JCheckBox("Power Brakes");
    
    //create strings for each element
    private String make = new String();
    private String color = new String();
    private String choice1 = new String();
    private String choice2 = new String();
    private String checks = "";
    

   public CarPrice()
   {
      //add items to combo box
      jcbo.addItem("Pick Color");
      jcbo.addItem("Red");
      jcbo.addItem("Blue");
      jcbo.addItem("Green");
      jcbo.addItem("Yellow");

      
      //add list to listPanel and add to frame    
      JScrollPane scroll = new JScrollPane(jlst);
      jlst.setVisibleRowCount(5); 
      listPanel.add(scroll);
      add(listPanel);

      //add display text area to choose panel
      choosePanel.add(display, BorderLayout.SOUTH);
      
      //create radio buttnos
      JPanel jpRadioButtons = new JPanel();
      jpRadioButtons.setLayout(new GridLayout(2, 2));
      jpRadioButtons.add(btn1);
      jpRadioButtons.add(btn2);
      jpRadioButtons.add(btn3);
      jpRadioButtons.add(btn4);
      
      //create radio button groups
      ButtonGroup group = new ButtonGroup();
      
      group.add(btn1);
      group.add(btn2);
      
      ButtonGroup group2 = new ButtonGroup();
      
      group2.add(btn3);
      group2.add(btn4);
      
      //anonymous listener for the jlist. It gets the selected index
      //and uses the same index from the car type array
      jlst.addListSelectionListener(new ListSelectionListener() 
      {
      @Override
      public void valueChanged(ListSelectionEvent e)
      {
        int index = jlst.getSelectedIndex();
        make = carTypes[index];
      }
      });
    
    //anonymous listener for jcombo box. gets the selected index
    //and determines which color to save to the color string
    jcbo.addItemListener(new ItemListener() 
    {
      @Override 
      public void itemStateChanged(ItemEvent e) 
      {
        int index = jcbo.getSelectedIndex();
        
        if(index == 1)
        {
          color = "Red ";
        }
        else if(index == 2)
        {
          color = "Blue ";
        }
        else if(index == 3)
        {
          color = "Green ";
        }
        else if(index == 4)
        {
          color = "Yellow ";
        }
      }
    });
    
      //anonymous listener attached to radio button1. 
      btn1.addActionListener(new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = btn1.getText();
        choice1 =  temp + " ";
      }
    });
      
      //anonymous listener attached to radio button2.
      btn2.addActionListener(new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = btn2.getText();
        choice1 = temp + " ";
      }
    });
    
    //anonymous listener attached to radio button3.
    btn3.addActionListener(new ActionListener() 
    {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = btn3.getText();
        choice2 = " with " + temp;
      }
    });
    
    //anonymous listener attached to radio button4.
    btn4.addActionListener(new ActionListener() 
    {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = btn4.getText();
        choice2 = " with " + temp;
      }
    });
      
      //add radio buttons to choose panel
      choosePanel.add(jpRadioButtons, BorderLayout.WEST);
      
      //create check boxes and add to jpCheckBoxes panel
      JPanel jpCheckBoxes = new JPanel();
      jpCheckBoxes.setLayout(new GridLayout(3, 2));
      jpCheckBoxes.add(check1);
      jpCheckBoxes.add(check2); 
      jpCheckBoxes.add(check3); 
      add(jpCheckBoxes, BorderLayout.EAST);
      
      //anonymous listener for check 1
      check1.addActionListener(new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = check1.getText();
        checks += ", " + temp;
      }
    });
    
      //anonymous listener for check 2
      check2.addActionListener(new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = check2.getText();
        checks += ", " + temp;
      }
    });
      
      //anonymous listener for check 3
      check3.addActionListener(new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        String temp = check3.getText();
        checks += ", " + temp;
      }
    });
      
      //add combobox to choose panel
      choosePanel.add(jcbo, BorderLayout.NORTH);
      
      //add check box panel to choose panel
      choosePanel.add(jpCheckBoxes, BorderLayout.EAST);
      
      //add display button at bottom
      add(command, BorderLayout.SOUTH);
      
      //anonymous listener for display button that takes all saved elements and
      //displays them
      command.addActionListener(new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
        display.setText(color + choice1 + make + choice2 + checks);
        color = "";
        make = "";
        choice1 = "";
        choice2 = "";
        checks = "";
      }
    });
      
      //add the two main panels to the overall panel
      panel.add(choosePanel);
      panel.add(listPanel);
      
      //add panel to the frame
      add(panel);
   
   }

    //main method to display the GUI
    public static void main(String[] args) 
    {
      CarPrice frame = new CarPrice();
      frame.setSize(780, 170);//made this size to prevent jlist from wrapping due to long worded selections
      frame.setTitle("Car Price");
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}