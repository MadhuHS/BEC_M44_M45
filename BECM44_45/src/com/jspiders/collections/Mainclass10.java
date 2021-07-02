package com.jspiders.collections;

import java.util.HashMap;

public class Mainclass10 {

	public static void main(String[] args)
	{
       HashMap hm1 = new HashMap();
       
       hm1.put(1,"hello");//insert
       hm1.put(2,"java");//insert
       hm1.put(3,"java");//insert
       hm1.put(null,"empty");//insert
       
       
       System.out.println(hm1.get(1)); //read
       System.out.println(hm1.get(2)); //read
       System.out.println(hm1.get(3)); //read
       System.out.println(hm1.get(null)); //read
       
       System.out.println("key = 5");
       System.out.println(hm1.get(5)); //read
       
       hm1.put(1,"world");//update
       
       System.out.println(hm1.get(1)); //read
       
       hm1.remove(1);//delete
       
       System.out.println(hm1.get(1));//read
       
       boolean b1 = hm1.containsKey(2);//search key
       System.out.println("b1 : "+b1);
       
       b1 = hm1.containsValue("python");//search value
       System.out.println("b1 : "+b1);
	}

}
