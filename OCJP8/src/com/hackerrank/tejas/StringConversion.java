package com.hackerrank.tejas;

public class StringConversion {
	
	public static void main(String args[])
	{
		int n=-1000;
		String s = String.valueOf(n);
		System.out.println("String value is ="+s);
		if(s.isEmpty())
		{
			System.out.println("Wrong Answer");
		}
		else
		{
			System.out.println("Good job");
		}
	}

}
