import java.io.Serializable;
//Kara Schrader
//CS1 1337.0U1
//Student class creates student objects and has a method to calculate tuition
public class Student implements Serializable
{
   protected String name;
   protected int hours;
   
   public Student(String name, int hours)
   {
      this.name = name;
      this.hours = hours;
   
   }
   /*
   public int calcTuition()
   {
      return (hours * 1000);
   }
   */
   
   public String toString()
   {
      return name + " is taking " + hours +" hours";//\nTution: $";
   }
   
   public boolean compareTo()
   {
      
   }

}

