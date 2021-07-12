package com.jspiders.threads;

public class Mainclass7 {
	static String str1 = new String("hello");
	static String str2 = new String("world");

	public static void main(String[] args) {
		Runnable task1 = () ->
		{
            System.out.println("t1 starts...");
			synchronized (str1)// first
			{
				System.out.println("t1 locked str1");
				
				int waitTime = 2000;
				try 
				{
					System.out.println("t1 going to pause state for "+waitTime + "milisec");
					str1.wait(waitTime);//2000miliSec --> 2sec
					System.out.println("t1 resumes the exceution");
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}

				System.out.println("t1 waiting to lock str2");
				synchronized (str2)// second
				{
					System.out.println("t1 locked str2");
					//---
					System.out.println("t1 unlock str2");
				}
				
				System.out.println("t1 unlock str1");
			}
			System.out.println("t1 ends...");
		};

		Runnable task2 = () -> {
			System.out.println("t2 starts...");
			
			synchronized (str2)// first
			{
				System.out.println("t2 locked str2");

				System.out.println("t2 waiting to lock str1");
				synchronized (str1)// second
				{
					System.out.println("t2 locked str1");
					//---
					System.out.println("t2 unlocked str1");
					str1.notifyAll();
				}
				System.out.println("t2 unlocked str2");
			}
			System.out.println("t2 ends...");
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

	}
}
