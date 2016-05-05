//Kara Schrader
//CS1 1337.0U1
//this program takes a word provided by the user when prompted and counts the number of capitol 
//letters, lowercase letters, digits and gives the length of the word.

import java.util.Scanner;

public class CountCharacters
{
   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in);
      
      String input = " ";
      int[] word = new int[100];
      int upperCaseCount= 0;
      int lowerCaseCount = 0;
      int digitCount = 0;
      char current = ' ';
      
      System.out.println("Please enter a word: ");//prompts the user
      input = keyboard.nextLine();//stores the word/characters
      
      //this for loop finds the numeric value of each character
      for(int i = 0; i < input.length(); i++)
      {
         current = input.charAt(i);
         word[i] = (int)current;
      }
      
      //this for loop decides if the character is either an uppercase, lowercase or a digit based on ASCII code.
      for(int j = 0; j < input.length(); j++)
      {
         if(word[j] >=48 && word[j]<=57)
         {
           digitCount++;
         }
         
         if(word[j] >=65 && word[j]<=90)
         {
         upperCaseCount++;
         }
         if(word[j] >=97 && word[j] <=122)
         {
         lowerCaseCount++;
         }
      }
      //prints the results
      System.out.println("There are " + upperCaseCount + " upper case letters, " 
      + lowerCaseCount + " lower case letters, and  " + digitCount + 
      " digits. The length of the word was "+ input.length());
      
   }//close the main method
}//close the countCharacters class
      
      
      