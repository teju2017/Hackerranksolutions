package com.tejas.java8.pkgfeature;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamworking {
	
	public void stringstream()
	{
	    Stream
	    .of("zxs","sdsdf","sddsfsdf","ACD")
	    .sorted()
	    .findFirst()
	    .ifPresent(System.out::println);
	    
	    System.out.println("Applying the filter on the String stream");
	    
	    Stream
	    .of("sdsd","sdfdf","xsdffg","cvfgh","qqwer","ertyuu")
	    .filter(x->x.startsWith("x"))
	    .sorted()
	    .forEach(x->System.out.println(x));
	    
	    
		 System.out.println("###########################################");
		 System.out.println("Using Filter,map,sorted and foreach");
	    
	    Stream
	    .of("tejas","teju","mala","Sheetal")
	    .filter(x->x.length()>4)
	    .map(x->x.toUpperCase())
	    .sorted()
	    .forEach(x->System.out.println(x));
	    
	}
	
	public void mapmethod(int arr[])
	{
		
		
		Arrays
		.stream(arr)
		.map(x -> x * x)
		.forEach(x->System.out.println(x));
		
	}
	
	public void fileread(String Filename)
	{
		try
		{
		    Stream<String> bands = Files.lines(Paths.get(("sample.xml")));
		    bands
		    .sorted()
		    .filter(x->x.length()>55)
		    .map(x->x.concat("###########"))
		    .forEach(x->System.out.println("Length of stream is  "+x.length()+ "  value = "+x));
		    
		    bands.close();
		}
		catch(Exception ae)
		{
			 System.out.println("Exception value is "+ae.getMessage()+ "Cause of exception is "+ae.getCause());
		}
		
	}
	
	
	public static void main(String args[])
	{
		 //Integer stream declaration and then printing the values
		
		 IntStream.range(1,8).skip(5).forEach(x->System.out.println(x));
		 
		 Streamworking strs = new Streamworking();
		 
		 System.out.println("Sum of values are "+
		 IntStream
		 .range(1,8)
		 .sum()
		 );
		 
		 
		 System.out.println("###########################################");
		 System.out.println("Calling the String stream method ");
		 strs.stringstream();
		 System.out.println("###########################################");
		 System.out.println("Calling the method using the map");
		 int x[] = {1,2,3};
		 strs.mapmethod(x);
		 System.out.println("###########################################");
		 System.out.println("Calling the File read method");
		 strs.fileread("sample.xml");
	}

}
