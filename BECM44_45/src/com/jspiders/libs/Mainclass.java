package com.jspiders.libs;

public class Mainclass
{
	public static void main(String[] args) 
	{
       Object obj1 = new Object();
       Object obj2 = new Object();
       Object obj3 = obj1;
       
       int i1 = obj1.hashCode();
       System.out.println("i1 : "+i1);
       
       System.out.println("i2 : "+obj2.hashCode());  
       
       System.out.println(obj1.toString());
       System.out.println(obj2);//System.out.println(obj2.toString())
       
       boolean b1 = obj1.equals(obj2);
       System.out.println("b1 : "+b1);
       
       boolean b2 = obj1.equals(obj3);
       System.out.println("b2 : "+b2);
	}
}
