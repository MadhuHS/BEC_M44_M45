package com.jspiders.wrapper;

public class Mainclass 
{	
	public static void test(Object n1,Object n2)
	{
	  System.out.println("n1 : "+n1);	
	  System.out.println("n2 : "+n2);	
	}
	
	public static void main(String[] args) 
	{  
      Integer i1 = 10;//Autoboxing
      Integer i2 = 20;//Autoboxing
      
      Double d1 = 2.5;//Autoboxing
      Double d2 = 1.25;//Autoboxing
      
      Boolean b1 = true;//Autoboxing
	
	  String s1 = "hello";
      String s2 =  new String("world");
      
      StringBuffer sb1 = new StringBuffer("hello");
      StringBuffer sb2 = new StringBuffer("world");
      
      
      test(s1,s2);
      test(sb1,sb2);
      
      
      test(s1,sb2);
      
      test(i1,i2);
      test(d1,d2);
	}
	
}