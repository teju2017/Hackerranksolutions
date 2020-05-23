package com.hackerrank.tejas;

public class StaticInitializer {
	
	static int B=10;
	static int H=-1;
	static boolean flag=false;
	
	static
	{
		if(B > 0  && H > 0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
	
		
	}
	
	public static void main(String args[])
	{
		if(flag)
		{
			int z=B*H;
			System.out.println(z);
		}
	}
    

}
