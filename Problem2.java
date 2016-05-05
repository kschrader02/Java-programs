/*On slide 38 there is a generic method called "findmax" that finds the largest
    item in a list.  Write a method similar to this called "halfOrdered", but 
    rather than finding the max, it should determine whether all of the elements 
    in the first half are less than or equal to all of the elements in the second half.  
    Return true if so and false if not.  If the list has an odd number of elements, 
    count the middle element as part of the first half.  If it has 0 or 1 element 
    only, just return true.  Include a main method in the class to demonstrate 
    your method on sample lists of your own.  These should be in a class called
    Problem2.
*/

public class Problem2
{
      public static void main(String[] args)
   {
      
      Integer[] listOdd = {0,2,3,54,323,4,31,3,7,96,2,3,20};
      Double[] listEven = {2.4, 4.2, 6.0, 23.2};
      Integer[] list1 = {24};
      
      //List<Integer> listOdd = Arrays.asList({0,2,3,54,323,4,31,3,7,96,2,3,20});
		//List<Orange> oranges = Arrays.asList(new Orange(20), new Orange(10), new Orange(5), new Orange(7));
		//List<Apple> apple = Arrays.<Fruit>asList(new Apple(1));
      
      System.out.println("Does this list work: " + halfOrdered(listOdd));
      System.out.println("Does this list work: " + halfOrdered(listEven));
      System.out.println("Does this list work: " + halfOrdered(list1));
   
   }

	public static <AnyType extends Comparable<? super AnyType>> boolean halfOrdered(AnyType[] arr)

	{
       boolean lessThan;
       int[] firstHalf;
       int[] secondHalf;
       
      //if lenght is 0 or 1 return true
      if(arr.length == 1 || arr.length == 0)
      {
         lessThan = true;
      }
      
      //assign lengths to the arrays
      else if(arr.length % 2 == 0)
      {
         firstHalf = new int[(arr.length) / 2];
         secondHalf = new int[(arr.length) / 2];
      }
     //if arr length is odd give middle element to first half
     else
     {
         firstHalf = new int[((arr.length - 1) / 2)];
         secondHalf = new int[((arr.length - 1) /2) - 1];
     }    
     
     //assign elements to respective arrays
     for(int i = 0; i < firstHalf.length; i++)
     {
         firstHalf[i] = arr[i];
     } 
     
     for(int l = 0; l < secondHalf.length; l++)
     {
       secondHalf[l] = arr[(arr.length / 2) - 1];
     }
     
     //check if first half is less than or equal to elements of second half
     for(int j = 0; j < firstHalf.length; j++)
     {
         for(int k = 0; k < secondHalf.length; k++)
         {
            if(firstHalf[j] <= secondHalf[k])
            {
               lessThan = true;
            }
            
            else if(firstHalf[j] > secondHalf[k])
            {
               lessThan = false;
            }
         }
     }
     
     return lessThan; 
         
	}
}





