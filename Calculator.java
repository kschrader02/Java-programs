import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class Calculator extends JFrame
{
    JButton digits[] = new JButton[10];
    JButton operators[] = new JButton[3];
    JLabel displayArea = new JLabel(" ");
	 JPanel digit19Panel = new JPanel();
	 JPanel digitPanel = new JPanel();
	 JPanel operatorPanel = new JPanel(); 
	 
	 int firstNumber;
	 int secondNumber;
	 char operator = ' ';
    
	 public Calculator()
	 {
	     setLayout(new BorderLayout());
		  
	     digitPanel.setLayout(new BorderLayout());
	     digit19Panel.setLayout(new GridLayout(3,3));
	 
	     DigitListener digitListener = new DigitListener();
	 
	     // create digit buttons and add to digit panel
		  for (int i=0; i<digits.length; i++)
		  {
		     digits[i] = new JButton("" + i);
			  digits[i].addActionListener(digitListener);
		  }
		  
		  digit19Panel.add(digits[7]);
		  digit19Panel.add(digits[8]);
		  digit19Panel.add(digits[9]);
	    
		  digit19Panel.add(digits[4]);
		  digit19Panel.add(digits[5]);
		  digit19Panel.add(digits[6]);
		  
		  digit19Panel.add(digits[1]);
		  digit19Panel.add(digits[2]);
		  digit19Panel.add(digits[3]);
		  
        OperatorListener operListener = new OperatorListener();

		  // create operator buttons and add to operator panel
		  operators[0] = new JButton("+");
		  operators[1] = new JButton("-");
		  operators[2] = new JButton("=");
		  
		  operators[0].addActionListener(operListener);
		  operators[1].addActionListener(operListener);		  
		  operators[2].addActionListener(operListener);
		  
		  operatorPanel.setLayout(new GridLayout(4,1));


		  operatorPanel.add(operators[0]);
		  operatorPanel.add(operators[1]);
		  operatorPanel.add(new JLabel());
		  operatorPanel.add(operators[2]);
			  
				  
		  digitPanel.add(digit19Panel, BorderLayout.CENTER);
		  digitPanel.add(digits[0], BorderLayout.SOUTH);
		  add(digitPanel, BorderLayout.CENTER);
		  add(displayArea, BorderLayout.NORTH);
		  add(operatorPanel, BorderLayout.EAST);
		  
		  
	 }

    public static void main(String[] args)
    {
	    JFrame frame = new Calculator();
	    frame.setTitle("Calculator");
	    frame.setSize(300, 300);
	    frame.setLocation(200, 100);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
    }
	 
	 
	 class DigitListener implements ActionListener
	 {
	    int count;
		 
	    public void actionPerformed(ActionEvent e)
		 {
		    if  (operator == ' ')
			 {
			    String buttonText = ((JButton)e.getSource()).getText();
			    firstNumber = firstNumber * 10 + Integer.parseInt(buttonText);
		            displayArea.setText("" + firstNumber);
			 }
			 else 
			 {
			    String buttonText = ((JButton)e.getSource()).getText();
			    secondNumber = secondNumber * 10 + Integer.parseInt(buttonText);
		            displayArea.setText("" + firstNumber + " " + operator + " " + secondNumber);
			 }
		 }	 
	 }
	 
	 class OperatorListener implements ActionListener
	 {
	    public void actionPerformed(ActionEvent e)
		 {
			 String buttonText = ((JButton)e.getSource()).getText();
			 
			 if (buttonText != "=")
			 {
			    operator = buttonText.charAt(0);
		            displayArea.setText("" + firstNumber + " " + operator );
			 }
			 else
			 {
			    int result=0;
			    switch (operator)
			    {
			       case '+':  result = firstNumber + secondNumber;
			                  break;
			       case '-':  result = firstNumber - secondNumber;
			                  break;
                            }

			    operator = ' ';
			    firstNumber = 0;
			    secondNumber = 0;
			    displayArea.setText("" + result);
			 }

		 }
	 
	 }
}