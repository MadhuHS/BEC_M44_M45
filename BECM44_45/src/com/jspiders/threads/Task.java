package com.jspiders.threads;

public class Task
{
	int[] a1 = {40,80,20,60,100};
	
	public void showArrayReverse()
	{
	  System.out.println("Reverse order");
	  for (int i = a1.length-1; i>=0; i--) 
	  {
		System.out.println(a1[i]);
	  }	
	  System.out.println();
	}
	
	public void showArray()
	{
	  System.out.println("Normal order");
	  for (int i = 0; i <= a1.length-1; i++)
	  {
		System.out.println(a1[i]);
	  }
	  System.out.println();

	}
}
