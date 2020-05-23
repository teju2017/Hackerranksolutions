package packageexam;

import java.util.ArrayList;
import java.util.List;

public class Genericone {
	
	public void exampletwo(List<? extends Number> variable)
	{
		System.out.println("Working ok");
		for(Number num : variable)
		{
			System.out.println("Num value "+num);
		}
	}
	 
	public void work(List<? extends String> var)
	{
		System.out.println("Value = "+var);
	}
	
	public void checker()
	{
		List<String> lis;
		lis = new ArrayList<String>();
		lis.add("working");
		lis.add("well");
		
		List<String> work = new ArrayList<String>();
		work.add("second");
		work.add("chance");
		work.add("nested list");
		
		List<List<String>> abc = new ArrayList<List<String>>();
		
		
		abc.add(lis);
		abc.add(work);
		
		for(List<String> var : abc)
		{
			 for(String x : var)
			 {
				 System.out.println("Variable value is "+x);
			 }
		}
		
		/*
		 *  nested list values
		 */
		
		List<List<List<String>>> emp = new ArrayList<List<List<String>>>();
		emp.add(abc);
		
		List<List<List<List<String>>>> onemore;
		
		
		
	}

}
