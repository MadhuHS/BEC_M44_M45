package com.jspiders.threads;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		Task tk1 = new Task();

		Runnable r1 = () -> 
		{
			tk1.showArray();
		};

		Runnable r2 = () -> 
		{
			tk1.showArrayReverse();
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}
}
