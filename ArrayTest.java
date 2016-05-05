import java.util.Random;
public class ArrayTest
{
   public static void main(String[] args)
   {
      char array2[] [] = new char[10][10];
  
      Random rnd = new Random();
      
      for(int i = 0; i < 25; i++)
      {
         int row = rnd.nextInt(10);
         int col = rnd.nextInt(10);
         
         array2[row][col] = '*';
      
      }
      
      for(int j = 0; j < array2.length; j++)
      {
         for(int k = 0; k < array2[j].length; k++)
         {
            if(array2[j][k] == '*')
               System.out.print(array2[j][k]);
            else
            {
               System.out.print(' ');
               System.out.println();
            }
         
         }
      }
   
   
   }




}