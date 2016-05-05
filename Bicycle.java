public class Bicycle
{
   
   private Tire tire1;
   private Tire tire2;
   
   
   public Bicycle(Tire t1, Tire t2)
   {
      tire1 = t1;
      tire2 = t2;
   }
   
   public Bicycle(int t1_size,int t1_pressure,int t2_size,int t2_pressure)
   {
      tire1 = new Tire(t1_size, t1_pressure);
      tire2 = new Tire(t2_size, t2_pressure);
   }
   
   public String toString()
   {
      return "Bicycle tire1: " + tire1.toString() + " tire2: " + tire2.toString();
   }
   
   public boolean overFilled()
   {
      return tire1.getPressure() > 50 || tire2.getPressure() > 50;
   }
}   