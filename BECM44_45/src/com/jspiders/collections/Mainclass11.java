package com.jspiders.collections;

import java.util.HashMap;
import java.util.Set;

public class Mainclass11 {

	public static void main(String[] args)
	{
       HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
       
       hm1.put(1,"hello");//insert
       hm1.put(2,"java");//insert
       hm1.put(3,"j2ee");//insert
       hm1.put(4,"springs");//insert
         
       //read all the values
       
       //get all the keys from the given HashMap
        Set<Integer> keys = hm1.keySet();
        
        //pass one key at a time to get() to read the value w.r.t key
        for(Integer key : keys)
        {
        	System.out.println(hm1.get(key));
        }
	}

}
