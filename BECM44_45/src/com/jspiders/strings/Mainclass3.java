package com.jspiders.strings;

public class Mainclass3 
{   
	public static String firstHalf(String str) 
	{
      System.out.println("input  : "+str);
      System.out.println(str.length());
	  String res = "";
	  StringBuilder sb1 = new StringBuilder();
	  
	  for(int i=0; i<=(str.length()-1)/2; i++)
	  {
		  char c1 = str.charAt(i);
		//res = res + c1;
		  sb1 = sb1.append(c1);
	  }
	  res = sb1.toString();//get the String value in StringBuffer Object(sb1)
	  return res;
	}
	public static void main(String[] args) 
	{
	  System.out.println("output : "+firstHalf("abcd"));
	}
}
