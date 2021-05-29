package com.jspiders.pkg4;

public class Demo 
{
    public    int    v1 = 123;
    protected double v2 = 2.45;
              long   v3 = 123456789098l;
    private   String v4 = "hello";

    public void test1()
	{
      System.out.println("this is public-test1() of Demo class");
      System.out.println(v4);
	}
    
    protected void test2()
	{
      System.out.println("this is protected-test2() of Demo class");
      test4();
	}
    
    void test3()//default or pkg-level
	{
      System.out.println("this is pkg-level-test3() of Demo class");
	}
    
    private void test4()
   	{
         System.out.println("this is private-test4() of Demo class");
   	}
}
