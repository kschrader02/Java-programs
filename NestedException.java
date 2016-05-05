//Kara Schrader
//CS1 1337.0U1
//This program creates a nested chain of exceptions that lets you choose which excpetion to throw
//by selecting ex1, ex2 or ex3. It then goes to the specified exception.

import java.util.*;

public class NestedException
{
	static Scanner keyboard = new Scanner(System.in);
	static String ex;
	
	public static void main(String[] args) throws Exception1, Exception2, Exception3
	{
		String id= "ex1" ;
		
		try{
			System.out.println("Statement 1.");
			method1();
			throw new Exception1();
		}
		catch (Exception1 ex1){
			if(id.compareTo(ex)==0)
			{
				System.out.println("Exception 1 is processing.");
				System.out.println(ex1);
			}
		}
	}
	
	public static void method1() throws Exception2
	{
		String id= "ex2";
		
		try{
			System.out.println("Statement 2.");
			method2();
			throw new Exception2();
		}
		catch (Exception2 ex2){
			if(id.compareTo(ex)==0)
			{
				System.out.println("Exception 2 is processing.");
				System.out.println(ex2);
			}
		}
	}
	
	public static void method2()
	{
		String id = "ex3";
		
		try{
			System.out.println("Statement 3.");
			method3();
			throw new Exception3();
		}
		catch (Exception3 ex3){
			if(id.compareTo(ex)==0)
			{
				System.out.println("Exception 3 is processing.");
				System.out.println(ex3);
			}
		}
	}
	
	public static void method3()
	{
		//Exception is thrown here
		System.out.println("Which Exception would you like to throw?");
      System.out.println("ex1\nex2\nex3");
		ex = keyboard.next();
	}
}

class Exception1 extends Exception
{
	public String toString()
	{
		return "You did something wrong";
	}
}

class Exception2 extends Exception
{
	public String toString()
	{
		return "My fault? Pssh";
	}
}

class Exception3 extends Exception
{
	public String toString()
	{
		return "Woah, bro. Get it together.";
	}
}