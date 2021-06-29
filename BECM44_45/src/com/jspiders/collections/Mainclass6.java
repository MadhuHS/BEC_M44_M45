package com.jspiders.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Mainclass6
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		
		//Create
		TreeSet<String> hs1 = new TreeSet<String>();
		
		String s1 = new String("bat");
		String s2 = new String("dam");
		String s3 = new String("ant");
		String s4 = new String("cat");
		String s5 = new String("ele");
		String s6 = new String("can");
		String s7 = new String("CAT");	
		
		hs1.add(s1);//insert
		hs1.add(s2);//insert
		hs1.add(s3);//insert
		hs1.add(s4);//insert
		hs1.add(s5);//insert
		hs1.add(s6);//insert
		hs1.add(s7);//insert
		
		
	    Iterator<String>  i1 = hs1.iterator();
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }
	    
	}
}







