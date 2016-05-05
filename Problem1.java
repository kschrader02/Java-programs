public class Problem1
{
   public static void main(String args[])
   {
      Integer[] nums = {1, 2, 3, 4, 6, 7, 8, 23};
      Double[] doubleNums = {2.9, 3.5, 2.5, 25.0, 33.4};

      System.out.println(contains(nums, 4));
      System.out.println(contains(doubleNums, 33.4));     
   }
 
   public static <AnyType> boolean contains(AnyType[] arr, AnyType x)
   {
         boolean match = false;
         
         for(AnyType val : arr)
         {
            if(x.equals(val))
            {
               match  = true;
            }
         }
         return match;
   }
}