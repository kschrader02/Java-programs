public class ExamplePairSwap
{
   public static void main(String[] args)
   {
   
      int[] swapPair = {28, 72, 33, 67, 90, 10, 16, 84, 45, 55};
      
      for(int i = 0; i < swapPair.length; i++)
      {
         System.out.print(swapPair[i] + " ");
      }
      
      System.out.println();
      
      swap(swapPair);
      
      for(int i = 0; i < swapPair.length; i++)
      {
         System.out.print(swapPair[i] + " ");
      }
   
   
   
   }
   
   public static void swap( int[] pairs)
   {
        int temp = 0;
        
        for(int i = 0; i < pairs.length; i += 2)
        {
            temp = pairs[i];
            pairs[i] = pairs[i + 1];
            pairs[i+1] = temp;
        }
   }
}