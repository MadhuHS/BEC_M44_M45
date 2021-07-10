package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mainclass4 
{
	static Task tk1 = new Task();
	
	public static void ftp(int nThreads)//Fixed Thread Pool
	{
		Runnable task1 = () -> 
		{
			tk1.showArray();
		};
		
		Runnable task2 = () -> 
		{
			tk1.showArrayReverse();
		};
		
		ExecutorService ftpool = Executors.newFixedThreadPool(nThreads);
		ftpool.submit(task1);
		ftpool.submit(task2);
		
		ftpool.shutdown();
		
	}
	
	public static void ctp()//Cached Thread Pool
	{
		Runnable task1 = () -> 
		{
			tk1.showArray();
		};
		
		Runnable task2 = () -> 
		{
			tk1.showArrayReverse();
		};
		
		ExecutorService cpool = Executors.newCachedThreadPool();
		cpool.submit(task1);
		cpool.submit(task2);
				
	}
	
	public static void stp(int corePoolSize)//Scheduled Thread Pool
	{
		Runnable task1 = () -> 
		{
			tk1.showArray();
		};
		
		Runnable task2 = () -> 
		{
			tk1.showArrayReverse();
		};
		
		/* ScheduledExecutorService stpool1 = Executors.newScheduledThreadPool(corePoolSize);
		 stpool1.schedule(task1,5,TimeUnit.SECONDS);*/
		 
		 ScheduledExecutorService stpool2 = Executors.newScheduledThreadPool(corePoolSize);
		 stpool2.scheduleAtFixedRate(task2,0,5,TimeUnit.SECONDS);
		
	}
	public static void ste()//Single Thread Executor
	{
		Runnable task1 = () -> 
		{
			tk1.showArray();
		};
		
		Runnable task2 = () -> 
		{
			tk1.showArrayReverse();
		};
		
		 
		 ExecutorService stpool = Executors.newSingleThreadExecutor();
		 stpool.submit(task1);
		 stpool.submit(task2);
		
	}
	public static void main(String[] args) 
	{
		int nThreads = Runtime.getRuntime().availableProcessors();
		//System.out.println("nThreads : "+nThreads);
        //ftp(nThreads);
       //ctp();
	   //stp(nThreads);
		ste();
	}
}




