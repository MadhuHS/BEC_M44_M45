package com.jspiders.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Mainclass5
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		
		//Create
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		
		hs1.add("java");//insert
		hs1.add("python");//insert
		hs1.add("javascript");//insert
		hs1.add("python");//insert
		hs1.add("c++");//insert
		
		//read all elements->for-each
		for(String str: hs1)
		{
		  System.out.println(str);
		}
		
		System.out.println();
		
		//read all elements->Iterator
	    Iterator<String>  i1 = hs1.iterator();
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }
	    
	    //update
	    boolean b1 = hs1.contains("python");
	    
	    if(b1 == true)
	    {
	    	hs1.remove("python");
	    	hs1.add("DevOps");
	    }
	    
	    System.out.println();
	    Iterator<String>  i2 = hs1.iterator();
	    while(i2.hasNext())
	    {
	    	System.out.println(i2.next());
	    }

	}
}







