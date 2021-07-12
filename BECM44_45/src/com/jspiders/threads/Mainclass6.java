package com.jspiders.threads;

import java.util.ArrayList;

public class Mainclass6 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);// 0
		a1.add(35);// 1
		a1.add(50);// 2
		a1.add(45);// 3

		Runnable task1 = () ->
		{
			synchronized (a1)
			{
				a1.add(2, 1000); // 20,35,1000,50,45
				System.out.println(a1.get(2));
			}
		};

		Runnable task2 = () -> 
		{
			synchronized (a1)
			{
				a1.remove(2); // 20,35,50,45
				System.out.println(a1.get(2));
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

	}
}
