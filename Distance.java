//Kara Schrader
//Shields
//CS 1336.004
//Program that calculates distance
public class Distance
{
	public static void main(String[] args)
	{
      float time = 5.0F;
      float acceleration = 32.0F;
      double distance;
      
      distance = .5*(acceleration*(Math.pow(time, 2)));
      
      
      System.out.println("The time was: \t\t\t"+ time + " sec.");
      System.out.println("The acceleration was: \t\t" + acceleration+ " feet/sec/sec");
      System.out.println("The distance traveled was:\t" + distance + " feet");
   }//closes main method
}//end class Distance