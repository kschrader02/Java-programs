import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class IncrementWindow extends JFrame {
  private JButton jbtUp = new JButton("+");
  private WindowPanel canvas = new WindowPanel();
    
  public IncrementWindow() {
    JPanel panel = new JPanel(new GridLayout(2,1)); // Use the panel to group buttons
    panel.add(new JLabel("0"));
    panel.add(jbtUp);
      
    this.add(canvas, BorderLayout.CENTER); // Add canvas to center
    this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame 
      
    jbtUp.addActionListener(new UpListener());
  }
    
  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new IncrementWindow();
    frame.setTitle("Increment Window");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
   
  class UpListener implements ActionListener { // Inner class
     @Override
     public void actionPerformed(ActionEvent e) {
       canvas.increment();
     }
  }
    
  class WindowPanel extends JPanel { // Inner class
    private int num = 0; // Default circle radius
        
    /** Enlarge the circle */
    public void increment() {
     num++;
     repaint();
    }
  }   
}  