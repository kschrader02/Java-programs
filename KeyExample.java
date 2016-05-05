import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyExample extends JFrame
{  
   JTextField textbox = new JTextField(10);
   JLabel message = new JLabel();
   
   public KeyExample()
   {
      JPanel panel = new JPanel();
      
      panel.setLayout(new BorderLayout());
      panel.add(textbox, BorderLayout.SOUTH);
      panel.add(message, BorderLayout.CENTER);
      
      add(panel);
      
      textbox.addKeyListener(new ListenerClass());
   }
 
 public static void main(String[] args) {
    JFrame frame = new KeyExample();
    frame.setTitle("Key Example");
    frame.setSize(200, 150);
    frame.setLocation(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  class ListenerClass extends KeyAdapter
  {
      @Override
      public void keyTyped(KeyEvent e)
      {
         char ch = e.getKeyChar();
         
         if(Character.isDigit(ch))
         {
            message.setText("Digit");
         }
         
         else if(Character.isLetter(ch))
         {
            message.setText("Alpha");
         }
         
         else
         {
            message.setText("Not diggit or alpha");
         }
      }
   }
}