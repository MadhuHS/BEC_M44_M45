package com.jspiders.collections;

import java.util.Vector;

public class Mainclass2 {
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		//Create
		Vector a1 = new Vector(10,2);
		a1.add(10);//insert
		a1.add(20);//insert
		a1.add(30);//insert
		a1.add(40);//insert
		a1.add(50);//insert
		a1.add(60);//insert
		a1.add(70);//insert
		a1.add(80);//insert
		a1.add(90);//insert
		a1.add(100);//insert
		a1.add(200);//insert
		
		
		//Read multiple values
		for(int i=0; i<= a1.size()-1; i++)
		{
	       System.out.println(a1.get(i));
		}
   
	}
}
