package com.tejas.interview;

import java.util.HashMap;
import java.util.Map;

/* Below code is an example of the overriding of the hashcode and equals method
 * you can test the working by commenting the 
 * hashcode and equals method to find the difference
 */

public class HashOverriding {
	
	private int x;
	private float z;
	private String name;
	
	public HashOverriding()
	{
		System.out.println("Default constructor");
	}
	
	
	public HashOverriding(int x,float z, String name)
	{
		System.out.println("Parameterized constructor");
		this.x=x;
		this.z=z;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		 if(obj == null || obj.getClass()!= this.getClass()) 
		 {
	            return false;
		 }
		if(obj == this)
		{
			return true;
		}
		
		HashOverriding o = (HashOverriding) obj;
		return(o.x == this.x && o.z == this.z && o.name.equals(this.name));
	}
	
	@Override
	public int hashCode()
	{
		
	    int var=11;
	    return this.x * 11;
	}
	
	
    public int getx()
	{
		return x;
	}
	
	
	public static void main(String args[])
	{
		HashOverriding obj1 = new HashOverriding(10,1.204f,"tejas");
		HashOverriding obj2 = new HashOverriding(10,1.204f,"tejas");
		
		// HashOverriding obj1 = new HashOverriding(10,1.204f,"tejas");
		// HashOverriding obj2 = new HashOverriding(10,1.204f,"tejas");
		
		if(obj1.equals(obj2))
		{
			System.out.println("#######################################");
			System.out.println("Obj1 and obj2 are equal");
		}
		else
		{
			System.out.println("#######################################");
			System.out.println("Obj1 and obj2 are different");
		}
		
		/* Below example is to understand the way the hash map works when the hashcode
		 * and equals method are Over rided
		 * 
		 * 1) When the two objects are equal then the key is considered as same and the value is overwritten
		 * 2) To test it , change the value passed as parameter to the constructor in the object creation
		 */
		
		Map<HashOverriding,String> hmp = new HashMap<HashOverriding,String>();
		hmp.put(obj1,"OBJECT ONE VALUE");
		hmp.put(obj2,"OBJECT TWO VALUE");
		
		
		System.out.println(" /* Since both the objects are same, object 1 gets replaced with object 2 */");
		for(HashOverriding h1 : hmp.keySet()) 
        { 
            System.out.println(hmp.get(h1)); 
        } 
		
	}
	

}
