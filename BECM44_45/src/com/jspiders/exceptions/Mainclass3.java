package com.jspiders.exceptions;

public class Mainclass3 {

	public static void test(int num1, int num2) {
		System.out.println("test2() starts...");
		int a1[] = { 20, 8, 30, 35 };
		try 
		{
			int res = num1 / num2;
			System.out.println("res : " + res);

			System.out.println("array element at index " + res + " : " + a1[res]);
		} 
		catch(Exception ref) 
		{
			System.out.println("Exception handled");
			ref.printStackTrace();
		}
		finally
		{
			System.out.println("finally executed");
		}

		System.out.println("test2() ends...");
	}

	public static void main(String[] args) {
		System.out.println("Program starts...");
		test(50,0);
		System.out.println("Program ends...");
	}
}
