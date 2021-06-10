package com.jspiders.lambda;

@FunctionalInterface
interface Run {
	public void count(int num);
}

public class Mainclass 
{
	public static void test(Run ref)
	{
		System.out.println("ref : " + ref);
		ref.count(4);
	}

	public static void main(String[] args) 
	{
		Run r1 = (int num) -> {
			for (int i = 1; i <= num; i++)
			{
				System.out.println(i);
			}

			System.out.println();
		};

		Run r2 = (int num) -> {
			for (int j = num; j >= 1; j--) 
			{
				System.out.println(j);
			}

			System.out.println();
		};

		test(r1);
		test(r2);

	}
}
