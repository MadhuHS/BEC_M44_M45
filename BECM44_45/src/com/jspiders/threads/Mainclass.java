package com.jspiders.threads;



class ThreadOne extends Thread
{
	@Override
	public void run()//task to be executed by the thread
	{
		Task tk1 = new Task();
		tk1.showArray();	
	}
}

class ThreadTwo extends Thread
{
	@Override
	public void run()//task to be executed by the thread
	{
		Task tk1 = new Task();
		tk1.showArrayReverse();	
	}
}

public class Mainclass 
{
	public static void main(String[] args)
	{
       ThreadOne t1 = new ThreadOne();
       ThreadTwo t2 = new ThreadTwo();
       
       t1.start();
       t2.start();
       
	}
}







