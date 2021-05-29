package com.jspiders.pkg5;

import com.jspiders.pkg4.Demo;

public class Sample extends Demo 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		System.out.println(d1.v1);
		d1.test1();
		
		Sample s1 = new Sample();
		System.out.println(s1.v2);
		s1.test2();
		
	}
}
