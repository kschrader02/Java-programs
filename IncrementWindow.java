//Kara Schrader
//CS1 1337.0U1
//this program creates a window that has a single button that counts the number of times it is clicked and displays the number
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IncrementWindow extends JFrame {
    protected int num = 0;
    
    // Create button, label and panel
    JButton jbtUp = new JButton("Increment");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("" + num, JLabel.CENTER);
    Increase canvas = new Increase();
   
    public IncrementWindow() {
    // add button and label to panel
    panel.setLayout(new BorderLayout());
    panel.add(label, BorderLayout.CENTER);
    panel.add(jbtUp, BorderLayout.SOUTH);

    add(panel); // Add panel to the frame
    UpListener listener = new UpListener();
    jbtUp.addActionListener(listener);//attatch listener to button


  }
  
  //main method that creates the GUI
  public static void main(String[] args) {
    JFrame frame = new IncrementWindow();
    frame.setTitle("Increment Window");
    frame.setSize(200, 150);
    frame.setLocation(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
   //creates the button Listener
   class UpListener implements ActionListener
   {
   
      public void actionPerformed(ActionEvent e)
      {
          canvas.increment();//calls the method from Increase class
      }
   }
   
   //creates the action for the up button
   class Increase extends JLabel
   {
      private int num = 0;
      
      public void increment()
      {
      
      num++;//increases the number count
      label.setText("" + num);//set the text
      panel.revalidate();//revalidate the panel
      }
   } 
}
