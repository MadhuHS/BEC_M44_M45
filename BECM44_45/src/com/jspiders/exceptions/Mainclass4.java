package com.jspiders.exceptions;

public class Mainclass4 
{
	public static int test(int num1, int num2)throws ArithmeticException
	{
		System.out.println("test2() starts...");
		int res = num1 / num2;
		System.out.println("test2() ends...");
		return res;
	}
	
	public static void test2(int num1)throws InterruptedException 
	{
		System.out.println("test2() starts...");
		Thread.sleep(num1);
		System.out.println("test2() ends...");
	}

	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		try 
		{
			int res = test(50, 0);
			System.out.println("res : " + res);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			test2(10);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Program ends...");
	}
}
