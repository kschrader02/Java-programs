//Kara Schrader
//CS 0U1
//This program takes a word entered by the user and splits in half in order to determine how many vowels
import java.util.Scanner;

public class CountVowels2
{
   public static void main(String args[])
	{
	   Scanner keyboard = new Scanner(System.in);
	   String input = "";
      
      System.out.println("Enter a word you want to count the vowels for: ");//prompt user
      input = keyboard.nextLine();
		
		int total = countVowels(input.toLowerCase());//set word to lowercase and call method
		
		System.out.println(total);
	}
	
   //recursive methods
	public static int countVowels(String s)
	{
	   return countVowels(s, 0, s.length()-1);
	}
	
   //split word in half and check left side, add vowels, check right side add vowels, then sum and return
	public static int countVowels(String s, int left, int right)
	{
      //empty string
	   if (s.length() == 0)
	      return 0;  
      //when one character is singled out check for vowel and continue 
	   else if (left == right)
		{		   
			if (Character.isLetter(s.charAt(left))&& s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u')
			    return 1;
             
             else 
             return 0;
	   }  
		else
		{
			int mid = (left + right)/2;//calculates new middle
         
         int leftsum = countVowels(s, left, mid);//recursive call for left side
         int rightsum = countVowels(s, mid+1, right);//recursive call for right side
				 
		   return leftsum + rightsum;//returns sum
		}
	}
}