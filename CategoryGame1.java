//Kara Schrader and Omar Aragon
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class CategoryGame1 extends JFrame
{

    int player=1;
    private String[] categoryTitles = {"DIRECTIONS","GEOGRAPHY", "MOVIES", "MUSIC", "SCIENCE", "SPORTS","                                "};
    private JList jlst = new JList(categoryTitles);
    private String[] correctAnswers = {"Budapest", "5", "everywhere and nowhere at the same time", "A body of water",
                                       "Pangea", "Antarctica", "Peru", "Europe", "USA", "No color", "Avatar", "Shawshank Redemption",
                                       "Morgan Freeman", "Pierce Brosnan", "Mr. Krabs", "92", "Claire Danes", "7", "10", "5'5\"",
                                       "Tennessee", "Ring of Fire", "America", "The Gramophone", "Arosmith", "Hey Jude, the Beatles",
                                       "Andrew Lloyd Webber", "Youtube", "N*SYNC", "NKOTBSB", "117", "Hydrogen", "Bohr Model",
                                       "ionic bonding", "Fg = G (m1*m2)/(d^2)", "299Ê792Ê458 m / s", "T","4.54 billion years",
                                       "The great red spot", "4", "20000", "100 yards", "Knee injuries", "4","no", "birdie","a hat trick",
                                       "4","Cricket", "USA"};
    private int time=10;                                   
    private JPanel categoryP = new JPanel(new GridLayout());
    private JPanel questionP = new JPanel(new GridLayout(5,1));
    private JPanel playerStats = new JPanel(new GridLayout(1,3,20,20));
    private JPanel gamePanel = new JPanel(new BorderLayout());
    private int score1;
    private int score2;
    private static int pos = 0;
    private static int index = 0;
    protected int playerNum = 0;
    private JLabel question = new JLabel("Categories Game", JLabel.CENTER);
    private JLabel p1 = new JLabel("Player1: " + score1 + " points",JLabel.CENTER);
    private JLabel s = new JLabel("TIMER", JLabel.CENTER);
    private JLabel p2 = new JLabel("Player2: " + score2 + " points",JLabel.CENTER);
    
    private Timer timer = new Timer(1000, new TimerListener());
	
	class TimerListener implements ActionListener
   {
 	 	@Override 
  	 	public void actionPerformed(ActionEvent e) //will this reset when it gets to the second player?
	 	{
    		s.setText("TIMER "+time);
			time--;
         if(player==1 && time==0 || pos==25)
			{
					time=10;
					timer.stop();
					player=2;
           		pos=25;
            	index=5;
					showQuestion(temp,pos);
					question.revalidate();
         	
			}
			timer.start();
			if(player==2 && time==0)
			{
					time=10;
					timer.stop();
					pos=50;
					index=10;
             	showQuestion(temp,pos);
					question.revalidate();


         	
			}

		

	 	} 
   } 


    
    private JRadioButton btn1 = new JRadioButton("");
    private JRadioButton btn2 = new JRadioButton("");
    private JRadioButton btn3 = new JRadioButton("");
    private JRadioButton btn4 = new JRadioButton("");
    
    private static int count;
    private static String[] geo = new String[50];
    private static String[] movies = new String[50];
    private static String[] music = new String[50];
    private static String[] science = new String[50];
    private static String[] sports = new String[50];  
    protected static String[] temp = new String[50];
    
   public CategoryGame1()
   {
      categoryP.add(jlst);
      
      add(new JScrollPane(jlst), BorderLayout.WEST);
      
      questionP.add(question);
      
      questionP.add(btn1);
      questionP.add(btn2);
      questionP.add(btn3);
      questionP.add(btn4);
      
      ButtonGroup group = new ButtonGroup();
      
      group.add(btn1);
      group.add(btn2);
      group.add(btn3);
      group.add(btn4);
      
      playerStats.add(p1);
      playerStats.add(s);
      playerStats.add(p2);
   
      gamePanel.add(categoryP, BorderLayout.WEST);
      gamePanel.add(questionP, BorderLayout.CENTER);
      gamePanel.add(playerStats, BorderLayout.SOUTH);
      
      add(gamePanel);
      
      Listener listener = new Listener();
      
      btn1.addActionListener(listener);
      btn2.addActionListener(listener);
      btn3.addActionListener(listener);
      btn4.addActionListener(listener);

      jlst.addListSelectionListener(new ListSelectionListener() 
      {
      @Override
      public void valueChanged(ListSelectionEvent e)
      {
        int selected = jlst.getSelectedIndex();
        
        if(selected == 0)
        {
          question.setText("<html><p>This is a categories game. Each player gets to answer 5 questions from each category in 1 minute." 
                           + " Please choose a category to get started.</p></html>");
        }
        
        else if(selected == 1)
        {
            index = 0;//tells where the index should start in the correct answer array to match category
            showQuestion(geo, 0);//calls show question with selected array of questions and answers 
				
        }
        else if(selected == 2)
        {
            index = 10;
            pos = 0;
            showQuestion(movies, 0); 
        }
        else if(selected == 3)
        {
            index = 20;
            pos = 0;
            showQuestion(music, 0); 
        }
        else if(selected == 4)
        {
            index = 30;
            pos = 0;
            showQuestion(science, 0);
             
        }
        else if(selected == 5)
        {
            index = 40;
            pos = 0;
            showQuestion(sports, 0); 
        }
        
		  timer.start();//start timer after one is selected
      } 
    }); 
    
    
  } 
    public static void main(String[] args) throws IOException{
    readStudent();
    CategoryGame frame = new CategoryGame();
    frame.setSize(650, 500);
    frame.setTitle("Category Game");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  //action listeners
  //listSelection listener
  //timer
  //

//OMAR DON'T TOUCH THIS METHOD> it works fine
public static void readStudent() throws FileNotFoundException
   {
      String line = "";
      File file = new File("categories.txt");//reads the text file
       
       //reads the information from the file
       try
       {
         int j = 0;
         Scanner scanFile  = new Scanner(file);
         
         while(scanFile.hasNext())
         {   
               //assigns the proper categories to their own arrays
               for(int i = 0; i < 250; i++)
               {           
                  line = scanFile.nextLine();

                  if(i >= 0 && i < 50)
                  {
                     geo[i] = line;//geo array
                  }
                  
                  else if(i >= 50 && i < 100)
                  {
                     movies[i - 50] = line;//movie array
                     //System.out.println(movies[i-50]);
                  }
                  
                  else if(i >= 100  && i < 150)
                  {  
                     music[i-100] = line;//music
                     //System.out.println(music[i-100]);
                  }
                  
                  else if(i >= 150 && i < 200)
                  {
                     science[i-150] = line;//science
                     //System.out.println(science[i-150]);
                  }
                  
                  else if(i >= 200 && i < 250)
                  { 
                     sports[i-200] = line;//sports
                     //System.out.println(sports[i-200]);
                  }
               }
            }
       }
      //catched the filenotfound exception 
      catch(FileNotFoundException ex)
      {
         System.out.println("File not found: " + file.getName());
      }
  }
  
  public void showQuestion(String[] arr, int pos)
  {
      if(player==1)
        {
          if(pos % 5 != 0 || pos == 25)//if mod by 5 evenly it is a question
            {
               
               question.setText("Player 2 GO!");
               question.revalidate();
               player=2;
               return;
            //goes out of bounds here when it gets to end of question set
            //need to stop it after the last question of each question set
            
            }
         }
      if(player==2)
         {
           if(pos % 5 != 0 || pos == 50)//if mod by 5 evenly it is a question
            {
               question.setText("PICK ANOTHER CATEGORY!");
               question.revalidate();
               player=1;
               return;
            //goes out of bounds here when it gets to end of question set
            //need to stop it after the last question of each question set
            
            }
         }

            question.setText(arr[pos]);//display question
         
         btn1.setText("" + arr[pos+1]);//display answer choices
         btn2.setText("" + arr[pos+2]);
         btn3.setText("" + arr[pos+3]);
         btn4.setText("" + arr[pos+4]);
         
         questionP.revalidate();//revalidate when next question is to be shown
         
         for(int i = 0; i < 50; i++)//stores in temp array so can be accessed by other methods
         {
            temp[i] = arr[i];
         }
         
         //showQuestion(arr, pos + 5);
   }
   
   class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        JRadioButton btn = (JRadioButton)e.getSource();
         String str = ((JRadioButton)e.getSource()).getText();
         
         if(e.getSource() == btn1)//determines button source
         {
            str = btn.getText();
         }
         else if(e.getSource() == btn2)
         {
            str = btn.getText();
         }
         else if(e.getSource() == btn3)
         {
            str = btn.getText();
         }
         else if(e.getSource() == btn4)
         {
            str = btn.getText();
         }
       
         if(str.compareTo(correctAnswers[index])== 0 && player==1)//for player one, if answer is correct increase score, index and show next
                                                                  //question
         {
            score1 = score1 + 1;
            p1.setText("Player1: " + score1 + " points");

            p1.revalidate();
            questionP.revalidate();
         }
         
         if(str.compareTo(correctAnswers[index])== 0 && player==2)//for player two, if answers correct increase score & index
         {
            score2 = score2 + 1;
            p2.setText("Player2: " + score2 + " points");
            p2.revalidate();
            
            showQuestion(temp, pos);
         }
         
         
            index++;
            pos = pos + 5;   
            showQuestion(temp, pos);
         
      }
   }   
}
