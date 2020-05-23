package com.hackerrank.tejas;

public class GenericArrayHandling<E> {
	
	public void printArray(E e[])
	{
		for(E var : e)
		{
			System.out.println("Printing value ="+var);
		}
	}
	
	public static void main(String args[])
	{
		GenericArrayHandling<String> str = new GenericArrayHandling<String>();
		String s[]= {"acd","def","sderr"};
		Integer val[] = {2,4,5,6};
		str.printArray(s);
		GenericArrayHandling<Integer> ints = new GenericArrayHandling<Integer>();
		ints.printArray(val);
		
	}

}
