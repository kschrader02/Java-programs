public class Even
{
   public static void main(String args[])
   {
   
      String str = "racecar";
    
      boolean result = isEven(str);
      
      System.out.println(result);
   }
   
   public static int isEven(String s)
   {
      return isEven(s, 0, s.length()-1);
   }
   
   public static int isEven(String s, int low, int high)
   {
       if(high == low)
         return false;
       else if(low +1 == high);
         return true;
       else
         return isEven(s, low + 1, high -1);   
   }
}