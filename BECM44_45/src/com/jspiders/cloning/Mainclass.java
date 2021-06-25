package com.jspiders.cloning;

 class User extends Object implements Cloneable
 {
	 String name;
	 long phn;
	 
	public User(String name, long phn) 
	{
		super();
		this.name = name;
		this.phn = phn;
	}
	
	@Override
	public String toString() 
	{
		String info = name + " " + phn;
		return info;
	}
	
	public void updatePhn(long phn)
	{
		this.phn = phn;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();/*call clone() of Object class
		                     - create object of user class and Upcast it to 
		                       Object class ref and return the upcasted ref.*/
	}
	 
 }

public class Mainclass 
{
	public static void main(String[] args) 
	{
      
	  User u1 = new User("Arjun",987787651l);
      System.out.println("u1 : "+u1.toString());
            
      u1.updatePhn(898778888l);
      System.out.println("u1 : "+u1.toString());
            
      try 
      {
		User u2 = (User)u1.clone();
		System.out.println("u2 : "+u2);
	  } 
      catch (CloneNotSupportedException e) 
      {
		e.printStackTrace();
    	}
	}
}










