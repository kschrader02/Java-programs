import java.util.Scanner;

public class Reverse
{
   public static void main(String[] args){

      String word;
      String newWord = "";
      int minIndex = 0;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the word or phrase you would like altered: ");
      word = keyboard.nextLine()+" ";
      
      for(int i = 0; i<word.length(); i++){
         if(word.charAt(i)==' ' || word.charAt(i)=='\'' || word.charAt(i)=='?' || word.charAt(i)=='!'){
            if(i != 0){
               newWord+= reverseString(word.substring(minIndex,i)) + word.charAt(i);
            }
            else{
               newWord += word.charAt(i);
            }
            
            minIndex = i+1;
         }
      }
      
      if(newWord.compareTo("")==0){
         newWord = reverseString(word);
      }
      
      System.out.println("You entered: " + word + " after alterations it is: " + newWord.substring(0));
  }
  
  public static String reverseString(String reversal){
    String reversed = "";
  
    for(int i = reversal.length() -1; i >= 0; i--){
         reversed += reversal.charAt(i);
    }
   
    return reversed;  
  }
}