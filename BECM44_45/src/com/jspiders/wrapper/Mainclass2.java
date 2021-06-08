package com.jspiders.wrapper;

public class Mainclass2 
{	
	public static void test(Object n1,Object n2)
	{
	  System.out.println("n1 : "+n1);	
	  System.out.println("n2 : "+n2);	
	}
	
	public static void main(String[] args) 
	{  	
	  
      StringBuffer sb1 = new StringBuffer("hello");
      StringBuffer sb2 = new StringBuffer("world");
      
      test(10,20);
      test(2.5,1.25);    
      test("hello","world");
      
	}
	
}