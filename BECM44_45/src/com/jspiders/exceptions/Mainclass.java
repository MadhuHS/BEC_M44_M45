package com.jspiders.exceptions;

public class Mainclass {

	public static void test1(int num1, int num2) 
	{
		System.out.println("test() starts...");

		if (num2 > 0) {
			int res = num1 / num2;
			System.out.println("res : " + res);
		} else {
			System.out.println("CANNOT DIVIDE BY ZERO");
		}
		System.out.println("test() ends...");
	}

	public static void test2(int num1, int num2) 
	{
		System.out.println("test2() starts...");
		
        try
        {
        	int res = num1 / num2;
    		System.out.println("res : " + res);	
        }
        catch(ArithmeticException ref)
        {
        	System.out.println("ArithmeticException handled");
			System.out.println("CANNOT DIVIDE BY ZERO");
        }

		System.out.println("test2() ends...");
	}

	public static void main(String[] args) {
		System.out.println("Program starts...");
		test1(50,0);
		test2(50,0);
		System.out.println("Program ends...");
	}
}
