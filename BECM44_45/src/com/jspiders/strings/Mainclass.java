package com.jspiders.strings;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		String s1 = new String("hello");
		String s2 = new String("world");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		
		System.out.println(s1.equals(s2));
	}
}
