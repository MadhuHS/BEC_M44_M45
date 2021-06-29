package com.jspiders.collections;

import java.util.Iterator;
import java.util.TreeSet;

class User implements Comparable<User>
{
	String name;
	int id;
	
	public User(String name, int id)
	{
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		String info = name +" "+ id;
		return info;
	}

	/*@Override
	public int compareTo(User us)
	{
		if(this.id > us.id) //pos
		{
			return 1;
		}
		else if(this.id < us.id)//neg

		{
			return -1;
		}
		else//zero
		{
		return 0;
		}
	}*/
	
	@Override
	public int compareTo(User us)
	{
		String n1 = this.name;
		String n2 = us.name;
		int res;
		
		if(n1.equalsIgnoreCase(n2) == true)
		{
			res = this.id - us.id;
		}
		else
		{
		 res = n1.compareTo(n2);//call the compareTo() of String class
		}
		
		return res;
	}
	
	
}

public class Mainclass7
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		
		//Create
		TreeSet<User> ts1 = new TreeSet<User>();
		
		User u1 = new User("aaa", 4);
		User u2 = new User("ddd", 1);
		User u3 = new User("bbb", 2);
		User u4 = new User("ccc", 3);
		User u5 = new User("ccc", 9);
		User u6 = new User("ccc", 3);
		
		ts1.add(u2);//insert
		ts1.add(u1);//insert
		ts1.add(u4);//insert
		ts1.add(u3);//insert
		ts1.add(u5);//insert
		ts1.add(u6);//insert
		
		Iterator<User> i1 = ts1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}







