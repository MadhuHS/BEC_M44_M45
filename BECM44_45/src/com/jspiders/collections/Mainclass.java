package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass 
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		//Create
		ArrayList a1 = new ArrayList();
		a1.add(20);//insert
		a1.add(10);//insert
		a1.add(30);//insert
		a1.add(40);//insert
		
		//Read
		System.out.println(a1.get(0));
		
		//Update
		a1.add(0, 2345);
		
		//Read
	    System.out.println(a1.get(0));
	    
	    //Delete
	    a1.remove(0);
	    
	    //Read
	    System.out.println(a1.get(0));
	    
	    
		ArrayList a2 = new ArrayList();
	    a2.add(20);//insert
		a2.add(10);//insert
		a2.add(30);//insert
		a2.add(40);//insert
		
		System.out.println();
		
		//Read multiple values
		for(int i=0; i<= a2.size()-1; i++)
		{
	      System.out.println(a1.get(i));
		}
	    
	    
	    
	}
}
