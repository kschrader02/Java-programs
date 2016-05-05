public class Star
{
   protected int coreTemp;
   protected int radius;

   public Star(int temp, int r)
   {
      coreTemp = temp;
      radius = r;
   }

   public int yearsLeft()
   {
       //suppose this was true
      return coreTemp*radius*radius;
   }
   
   public String toString()
   {
      return "This star has a core temp of " + coreTemp + " and a radius of " + radius;
   }

}


class RedDwarf extends Star
{
   public RedDwarf(int temp, int r)
   {
      super(temp, r);
   }

   public int yearsLeft()
   {
      return coreTemp*radius;
   }

}

class StarTest
{
   public static void main(String[] args)
   {
      Star star = new Star(10000000, 10000000);
      RedDwarf reddwarf = new RedDwarf(5000000,2000000);
      Star star1 = reddwarf;
      
      System.out.println("Years left: " + star1.yearsLeft());
      System.out.println("Years left: " + star.yearsLeft());
      System.out.println("Years left: " + reddwarf.yearsLeft());
      
   }
   
}
      
   



      