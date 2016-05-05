import java.util.Scanner;

public class grossPay
{
	public static void main(String [] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		int hoursWorked;
		double payRate;
		double overTimePay;
		double grossPay;
		
		System.out.println("What were the hours worked?");
		hoursWorked = keyboard.nextInt();
		
		System.out.println("What was the pay rate?");
		payRate = keyboard.nextDouble();
		
		if( hoursWorked > 40)
		{
			overTimePay = payRate * 1.5 * (hoursWorked - 40);
			grossPay = 40 * payRate + overTimePay;
		}
		
		else
		{
			grossPay = hoursWorked * payRate;
		}
		
		System.out.println("The gross pay was $" + grossPay + ".");
	}
}