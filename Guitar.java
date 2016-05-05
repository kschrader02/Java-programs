public class Guitar extends MusicalInstrument
{
   private int commission;
   
   public Guitar(String empID, String firstName, String lastName, int salary, int commission)
   {
      super(empID, firstName, lastName, salary);
      this.commission = commission;
   }
   
   public void raise()
   {
      System.out.println("\n" + firstName + " " + lastName + "\nID: " + empID + "\nSalary with raise: $" + (salary + commission));
   }
}