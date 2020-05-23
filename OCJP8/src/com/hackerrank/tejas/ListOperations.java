package com.hackerrank.tejas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
	
	public static void main(String args[])
	{
		List<Integer> lis = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int rows = scan.nextInt();
			System.out.println("rows = "+rows);
		    String s[] = scan.next().split(" ");
		    for(String var : s)
		    {
		    	lis.add(Integer.valueOf(var));
		    }
		    int queries = scan.nextInt();
		    System.out.println("Queries ="+queries);
		    for(int var=0;var<=queries;var++)
		    {
		    	String operation = scan.next();
		    	if(operation.contentEquals("Insert"))
		    	{
		    		String val[] = scan.next().split(" ");
		    		lis.add(Integer.valueOf(val[0]), Integer.valueOf(val[1]));
		    	}
		    	if(operation.contentEquals("Delete"))
		    	{
		    		String val[] = scan.next().split(" ");
		    		lis.remove(Integer.valueOf(val[0]));
		    	}
		    		scan.close();
		    }
		}
	}
	

}
