package com.jspiders.exceptions;

public class Mainclass {
    
	public static void test(int num1,int num2) 
	{
	  System.out.println("test() starts...");
	  
	  int res = num1/num2;
	  System.out.println("res : "+res);
	  
	  System.out.println("test() ends...");
	}
	public static void main(String[] args) 
	{
       System.out.println("Program starts...");
       test(50,0);
       System.out.println("Program ends...");
	}

}
