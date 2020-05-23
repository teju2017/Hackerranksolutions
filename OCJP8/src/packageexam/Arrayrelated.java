/**
 * Comments can come before package statement
 */

package packageexam;

import java.time.LocalTime;

import java.time.*;
import java.util.*;

public class Arrayrelated {
	
	public final int /**   */ chk[]= {1,2,3};
	

	private Arrayrelated() {
		// TODO Auto-generated constructor stub
		char[] C={'a','b','c','d','@'};
		System.out.println("Value is "+C[4] +" and   "+C[C.length-1]);
		int[][] arr = new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	 static {
		System.out.println("First block execution");
		System.out.println(""+1+2);
		System.out.println(""+(1+2));
		
	}

	{ System.out.println("checking whether it works ok"); }; 
	
	
	public void arrayLooping()
	{
		int z[]= {1,2,3};
		for(int i:z)
		{
			System.out.println("value of i is"+i);
		}
		
		System.out.println("**************** Below is a looping Iteration *******************************");
		int z1[][][]= {{{1,2,3},{2,4,5}}};
		for(int x2[][]:z1)
		{
			for(int x1[]:x2)
			{
				for(int x0:x1)
				{
					System.out.println("Value of X0 variable iteration is "+x0);
				}
			}
		}

			
	}
	
	public void teju() throws Exception
	{
		
		System.out.println("******************method=Teju  kelasa maadu ***********************");
		for(int l=0;l>5;l++)
			System.out.println("WOrkig ok now, check the value");
		
		int m=10,n=5;
		System.out.println("m and n values "+(m+n));
		System.out.println("m and n values "+m+n);
		try
		{
			m/=n;
		}
		catch(Exception a)
		{
			System.out.println("Exception is caught");
		}
		finally {
			System.out.println("Working absolutely ok");
		}
		
		
		for(int n1=0;n1<10;++n1)
		{
			System.out.println("Value of n1 is "+n1);
		}
	}
	
	public void arrayIncrement()
	{
		System.out.println("*****************Starting the array Increment ********************** ");
		final int a[]=new int[3];
		int len= a.length;
		System.out.println("Value of a is "+len);
		a[1]++;
		for(int j:a)
		{
			System.out.println("Value of J is  "+j);
		}
		
		System.out.println("********************** Next check *****************************");
		int k[][]=new int[3][2];
		k[0]=new int[3];
		// k[2]= {1,2,3};  /* Array Constants can only be used at the time of initialization */
		
		System.out.println("********************** Array Sorting **************************");
		int ints[]={2,-1,5};
		Arrays.sort(ints);
		int index=0;
		for(int x:ints)
		{
			System.out.println("Index value "+index+"  = "+x);
			index++;
		}
		System.out.println("Binary search of the value 2 in the array ints is "+Arrays.binarySearch(ints,-1));
		
		
		
	}
	
	public void arrayComparison()
	{
		int a[]= {2,-1,5};
		int b[]= {2,-1,5};
		
		System.out.println("ArrayComparison starts");
		
		int a1=10;
		if(a1 > 10)
		{
			int y=20;
		}
		else
		{
			int y=30;
		}
		System.out.println("Value of y is ");
		
		Integer[] z1 = new Integer[2];
		z1[1]=100;
		for(Integer l : z1)
		{
			System.out.println("value is "+l);
		}
		
		
	}
		
		
		
	
	
	
	public void currenttime()
	{
		  System.out.println(LocalTime.now());
		  LocalDate date = LocalDate.of(2015,3,26);
		  Period p= Period.ofDays(1);
		  System.out.println(date.plus(p));
	}
	
	public void complex()
	{
		System.out.println("Its fine");
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("I");
		abc.add("am");
		abc.add("working");
		System.out.println("Total array list "+abc);
		String ws1[] = new String[abc.size()];
		String ws2[]=abc.toArray(ws1);
		System.out.println("WS1==WS2"+(ws1==ws2));
		System.out.println("ws1="+Arrays.toString(ws1));
		System.out.println("ws2="+Arrays.toString(ws2));
		ws1=new String[1];
		ws1[0]="TEJAS";
		ws2=abc.toArray(ws1);
		System.out.println("WS1==WS2"+(ws1==ws2));
		System.out.println("ws1="+Arrays.toString(ws1));
		System.out.println("ws2="+Arrays.toString(ws2));
		Integer number = Integer.valueOf("100");
		System.out.println("Variable value is "+number);
	}

		
		public void Twodimensional()
		{
			System.out.println("Checking for the values ");
			int[][] x = new int[5][5];
			x[0][0]=1200;
			x[0][1]=2;
			System.out.println("Length of the array x is "+x.length +" and value is "+x[0][0]);
		}
		
		public void twodimensionvalueinitialize()
		{
			int[][] arrInt = { { 1, 2 ,10},{ 3, 4, 5,6 } };
			for (int i = 0; i < arrInt.length; i++) {
				for (int j = 0; j < arrInt[i].length; j++) {
					System.out.println("i="+i+" and J= "+j+" and value is "+arrInt[i][j] + " ");
				}
				System.out.println("");
			}
			System.out.println("**** End of the twodimensionvalueinitialize*****");
			System.out.println();
		}
		
		public void twodimenstweak()
		{
			int xy[][]= {{2,3,4,5},{3,4,5,6},{56,57,58},{45,46,47,67}};
			for (int i = 0; i < xy.length; i++) {
				for (int j = 0; j < xy[i].length; j++) {
					System.out.println("i="+i+" and J= "+j+" and value is "+xy[i][j] + " ");
				}
				System.out.println("");
			}
			System.out.println("**** End of twodimensiontweak *****");
		}
		
		public void bytecheck()
		{
			  ///int y[]=new int[ob101];
			  int y1[][]=new int[10][];
			  //y1[0][1]=120;
			  System.out.println("Array values are "+y1.length);
			  
		}
		
		public void singlearray()
		{
			int tej[] = new int[10];
			//System.out.println("Length of array is "+tej.length+" and value of eleventh element is "+tej[10]);
			//int val[]=new int[-5];
			//System.out.println("Length of array is "+val.length+" and value of eleventh element is "+val[-1]);
		}
		
		public void doublecheck()
		{
			Double abc=Double.valueOf("120D");
			System.out.println("Value is "+abc);
		}
		
		public static void main(String args[])
		{
			Arrayrelated obj = new Arrayrelated();
			obj.Twodimensional();
			System.out.println("Calling the initialization value method");
			obj.twodimensionvalueinitialize();
			obj.twodimenstweak();
			obj.bytecheck();
			obj.singlearray();
			obj.doublecheck();
			obj.currenttime();
			obj.complex();
			obj.arrayComparison();
			obj.arrayLooping();
			obj.arrayIncrement();
			try
			{
			  obj.teju();
			}
			catch(Exception ae)
			{
				System.out.println("It might throw the exception, Handle it well");
			}
		}
		
	}

