package com.jspiders.garabgecollection;

class Sample extends Object
{
	public void test(int num) 
	{
		for (int i = 1; i <= num; i++)
		{
			System.out.println(i);
		}
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Sample class Object deleted");
	}
}

public class Mainclass
{
	public static void main(String[] args)
	{
        System.out.println("Program starts...");
        
        Sample s1 = new Sample();
        s1.test(5);
        
        s1 = null;//derefernce the object
        
        System.gc();//call garbage collector to delete the
        
        int[] a1 = {4,2,8,9};
        System.out.println("div : "+a1[2]/4);
        
        System.out.println("Program ends...");
	}
}
