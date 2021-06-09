package com.jspiders.lambda;

import java.util.Comparator;
//Application of lambda function

import java.util.TreeSet;

public class Mainclass2
{
	public static void main(String[] args) 
	{
		Comparator<String> c1 = (String gvn, String othr)-> 
		{
			int res = gvn.compareTo(othr);
			return res;
		};
		
		Comparator<String> c2 = (String gvn, String othr)-> 
		{
			int res = othr.compareTo(gvn);
			return res;
		};
		
		TreeSet<String> t1 = new TreeSet<String>(c2);

		t1.add(new String("Bat"));//---> compare() of OrderZtoA
		t1.add(new String("Camel"));
		t1.add(new String("Apple"));
		t1.add(new String("Eye"));
		t1.add(new String("Ant"));
		t1.add(new String("Desk"));
		
		System.out.println(t1);
	}

}