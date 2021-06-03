package com.jspiders.exceptions;

public class Mainclass2 {

	public static void test(int num1, int num2) 
	{
		System.out.println("test2() starts...");
		int a1[] = { 20, 8, 30, 35 };
		try 
		{
			int res = num1 / num2;
			System.out.println("res : " + res);

			System.out.println("array element at index " + res + " : " + a1[res]);
		} 
		catch (ArithmeticException ref) 
		{
			System.out.println("ArithmeticException handled");
			System.out.println("CANNOT DIVIDE BY ZERO");
		}
		catch (ArrayIndexOutOfBoundsException ref) 
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
			System.out.println("INVALID INDEX");
		}

		System.out.println("test2() ends...");
	}

	public static void main(String[] args) {
		System.out.println("Program starts...");
		test(50,2);
		System.out.println("Program ends...");
	}
}
