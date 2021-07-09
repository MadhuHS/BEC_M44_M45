package com.jspiders.threads;

class Superclass {

}

class ThreadThree extends Superclass implements Runnable {
	@Override
	public void run()// task to be executed by the thread
	{
		Task tk1 = new Task();
		tk1.showArray();
	}
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread starts");
		
		ThreadThree t3 = new ThreadThree();

		Thread th1 = new Thread(t3);

		th1.start();
		System.out.println("Main thread ends");

	}
}
