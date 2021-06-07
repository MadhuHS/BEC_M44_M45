package com.jspiders.strings;

public class Mainclass2 
{
	public static void main(String[] args)
	{
       String s1 = new String("hello");
       String s2 = "hello";
       String s3 = new String("hello");
       String s4 = "hello";
       String s5 = "world";
       String s6 = s1 + s5;//helloworld
       String s7 = "hello" + s5;//helloworld
       String s8 = "hello" + "world";//helloworld
       String s9 = "helloworld";
       
       
       System.out.println(s1.equals(s2));//comp chars
       
       System.out.println(s1 == s2);//comp address
       System.out.println(s1 == s3);//comp address
       System.out.println(s2 == s4);//comp address
       System.out.println(s2 == s4);//comp address
       System.out.println(s6 == s7);//comp address
       System.out.println(s8 == s9);//comp address
       
	}
}
