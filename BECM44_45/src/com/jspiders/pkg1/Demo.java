package com.jspiders.pkg1;

import com.jspiders.pkg2.Sample;

public class Demo 
{
	public static void main(String[] args) 
	{
       System.out.println("Program starts...");
       
       Sample.test();
       Sample s1 = new Sample();
       s1.view();
       
       com.jspiders.pkg3.Sample.test();
       com.jspiders.pkg3.Sample s2 = new com.jspiders.pkg3.Sample();
       s2.view();
       
       System.out.println("Program ends...");
	}
}
