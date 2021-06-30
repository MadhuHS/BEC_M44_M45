package com.jspiders.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;


public class Mainclass9
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		
		//Create
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		String s1 = new String("bat");
		String s2 = new String("dam");
		String s3 = new String("ant");
		String s4 = new String("cat");
		String s5 = new String("ele");
		String s6 = new String("can");
		String s7 = new String("cat");
		String s8 = new String("bat");
	
		pq1.add(s1);//insert
		pq1.add(s2);//insert
		pq1.add(s3);//insert
		pq1.add(s4);//insert
		pq1.add(s5);//insert
		pq1.add(s6);//insert
		pq1.add(s7);//insert
		pq1.add(s8);//insert
		
		System.out.println("size : "+pq1.size());
		
		while(pq1.size() != 0)
		{
		  System.out.println(pq1.poll());
		}
		
		
		System.out.println("size : "+pq1.size());

	    
	}
}







