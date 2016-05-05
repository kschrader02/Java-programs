//Kara Schrader
//CS 0U1
//This program takes a word entered by the user and counts how many vowels are in it and returns the number
import java.util.Scanner;

public class CountVowels
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
	   return countVowels(s, 0);
	}
	
   //takes word and traverses each position and increases count if it's a vowel
	public static int countVowels(String s, int position)
	{
      // empty string, nothing to count
	   if (s.length() == 0)
	      return 0;
      //if it's the last one check for vowel
	   else if (position == s.length() - 1)
		{
			int lastone;
			if (Character.isLetter(s.charAt(position)) && s.charAt(position) == 'a' || s.charAt(position) == 'e'|| s.charAt(position) == 'i' || s.charAt(position) == 'o' || s.charAt(position) == 'u')
            
			    lastone = 1;
		   else
			    lastone = 0;
			return lastone;
	   } 
      //otherwise check the first one and add in the rest 
		else
		{
			int firstone;
			if (Character.isLetter(s.charAt(position))&& s.charAt(position) == 'a' || s.charAt(position) == 'e' || s.charAt(position) == 'i' || s.charAt(position) == 'o' || s.charAt(position) == 'u')
			    firstone = 1;
		   else
			    firstone = 0;
				 
		   return firstone + countVowels(s, position+1);//recursive call
		}
	}
}