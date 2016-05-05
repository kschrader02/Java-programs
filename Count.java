public class CountSpaces
{
   public static void main(String args[])
   {
   
      String str = "The quick brown fox jumped over the lazy dog";
    
      int total = CountSpaces(str);
      
      System.out.println(total);
   }
   
   public static int CountSpaces(String s)
   {
      return CountSpaces(s, 0);
   }
   
   public static int CountSpaces(String s, int position)
   {
      if(position == s.length()-1)
      {   
      int lastone;
      if(Character.isSpaceChar(s.charAt(position)))
          lastone = 1;
          else lastone = 0;
      return lastone;
     }
      else
      {
         int firstone;
         if(Character.isSpaceChar(s.charAt(position)))
            firstone = 1;
         else firstone = 0;
            
         return firstone + CountSpaces(s, position+1);   
      }
   }
}