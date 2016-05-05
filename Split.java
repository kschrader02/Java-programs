public class Split
{
   public static void main(String[] args)
   {
   
     String s = "972 111 2222";
     
     String[] parts = s.split(" ");
     
     System.out.println("(" + parts[0] + ")" + parts[1] + "-" + parts[2]);
     
   }
   
 }