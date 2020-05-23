package com.hackerrank.tejas;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Mapoperations {
	
	public static void main(String args[])
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("sscvcv",1000);
		map.put("xyz",200);
		map.put("TREE",125);
		for(String s : map.keySet())
		{
			System.out.println("Name ="+s+ "  value ="+map.get(s));
		    System.out.println("Value ="+map.get("xdsfdsfds"));
		}
		
		List<String> x = new ArrayList<String>();
		x.add("tejas");
		x.add("working");
		x.add("well");
		x.remove(1);
		System.out.println("Value at 1 is "+x.get(1));
		System.out.println("Length of x list is "+x.size());
		
	}

}
