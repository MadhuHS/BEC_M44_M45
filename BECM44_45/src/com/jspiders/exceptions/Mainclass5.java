package com.jspiders.exceptions;

public class Mainclass5 
{
	static int attempt = 3;
	
	public static void loginWithPin(int pin)throws ArithmeticException
	{
	   if(attempt >= 0)
	   {
		 if(pin == 1234)
		 {
			System.out.println("Login success"); 
			return;
		 }
		 else
		 {   
			 attempt--;
			 System.out.println("Incorrect PIN");
			 System.out.println(attempt +" attempt left");
			 
			 if(attempt == 0)
			 {
				 String reason = "Number of attempts exceded : 3";
				 IllegalArgumentException i1 = new IllegalArgumentException(reason);
				 throw i1;
			 }
		 }
	   }
	   
	   
	}
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		loginWithPin(1264);
		loginWithPin(1264);
		loginWithPin(1264);
		
		System.out.println("Program ends...");
	}
}
