package com.jspiders.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class StringBufferComparator implements Comparator<StringBuffer>
{
	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2)
	{
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		int res = s2.compareTo(s1);
		return res;
	}
	
}

public class Mainclass6
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		
		StringBufferComparator comp = new StringBufferComparator();
		//Create
		TreeSet<StringBuffer> hs1 = new TreeSet<StringBuffer>(comp);
		
		StringBuffer s1 = new StringBuffer("bat");
		StringBuffer s2 = new StringBuffer("dam");
		StringBuffer s3 = new StringBuffer("ant");
		StringBuffer s4 = new StringBuffer("cat");
		StringBuffer s5 = new StringBuffer("ele");
		StringBuffer s6 = new StringBuffer("can");
		StringBuffer s7 = new StringBuffer("CAT");	
		
		hs1.add(s1);//insert
		hs1.add(s2);//insert
		hs1.add(s3);//insert
		hs1.add(s4);//insert
		hs1.add(s5);//insert
		hs1.add(s6);//insert
		hs1.add(s7);//insert
		
		
	    Iterator<StringBuffer>  i1 = hs1.iterator();
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }
	    
	}
}







