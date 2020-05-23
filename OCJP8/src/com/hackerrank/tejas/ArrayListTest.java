package com.hackerrank.tejas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListTest {
	
	public List<String[]> numlist = new ArrayList<String[]>();
	public List<String[]> query = new ArrayList<String[]>();
	

	public static void main(String args[]) throws NumberFormatException
	{
		ArrayListTest obj = new ArrayListTest();
		System.out.println("Enter the values to fill");
		
		Scanner scan = new Scanner(System.in);
		
		
		
	    int rows = Integer.valueOf(scan.nextLine());
	    
	    if(rows <=1 && rows >= 20000)
	    {
	    	System.out.println("Initial validation failed, number passed is "+rows);
	    	System.exit(1);
	    }
	    	
	    for(int x=0;x<rows;x++)
	    {
	    	obj.numlist.add(scan.nextLine().split(" "));

	    }
	    
	    if(scan.hasNextLine())
	    {
	     int querynum = Integer.valueOf(scan.nextLine());
	     
	     if ( querynum < 1 && querynum > 1000)
	     {
	    	 System.out.println("QUery validation failed "+querynum);
	    	 System.exit(1);
	     }
	     
	     for(int x=0;x<querynum;x++)
	     {
	     	obj.query.add(scan.nextLine().split(" "));
	     }
	     
	     for(String val[] : obj.query)
	     {
	    	//System.out.println(" Value  ="+numlist.get(Integer.valueOf(val[0])));
	    	 System.out.println("value ="+val[0]+"value1 ="+val[1]);
	    	 int rownumber=Integer.valueOf(val[0])-1;
	    	 String x[]=obj.numlist.get(rownumber);
	    	 for(String xvar : x)
	    	 {
	    		 System.out.println("xvar value is "+xvar);
	    	 }
	    	 try
	    	 {
	    	   int subscript = Integer.valueOf(val[1]);
	    	   System.out.println("The value is "+x[Integer.valueOf(val[1])]);
	    	 }
	    	 catch(Exception ae)
	    	 {
	    		 System.out.println("ERROR");
	    	 }
	     }
	    
	    }
	}   
		
}	

	
