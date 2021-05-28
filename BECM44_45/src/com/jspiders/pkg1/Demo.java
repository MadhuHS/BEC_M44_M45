package com.jspiders.pkg1;

import com.jspiders.pkg2.Sample;
import com.jspiders.pkg3.Run;

public class Demo 
{
	public static void main(String[] args) 
	{
       System.out.println("Program starts...");
       
       Sample.test();
       
       Sample s1 = new Sample();
       s1.view();
       
       System.out.println("Program ends...");
	}
}
