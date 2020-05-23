package packageexam;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Lambdasimple  {
	
	public Integer a[]= {11,22,3333};
	public int ab[]= {112,223,334};
	
	public List<Integer> convertarr(Integer arr[])
	{
		return Arrays.asList(arr);
		
	}
	
	
	public List<Integer> convertas(int ab[])
	{
		Integer[] temp = new Integer[3];
		for(int x=0;x<ab.length;x++)
		{
			temp[x]=Integer.valueOf(ab[x]);
		}
		return Arrays.asList(temp);
	}
	
	

	public static void main(String args[])
	{
		Displayinterface obj = ()->{ System.out.println("Working well"); };
		obj.checking();
		obj.showdata();
		// int a=4;
		// int b=5;
		int c;
		Checkertwo chk = (a,b)->(a*b); 
		c=chk.multab(10,5);
		System.out.println("Value of C is "+c);
		System.out.println("Bi functional interface example");
		BiFunction<String ,String , String > fun = (a,b)->(a.concat(b));
		System.out.println("Concatted value is "+fun.apply("its working ","well"));
		Lambdasimple lab = new Lambdasimple();
		List<Integer> x=lab.convertarr(lab.a);
	    for(Integer l : x)
	    {
	    	System.out.println("Value of l is "+l);
	    	System.out.println("Value is "+l);
	    }
	    List<Integer> lin = lab.convertas(lab.ab);
	    for(Integer x1 : lin)
	    {
	    	System.out.println("Working well "+x1);
	    }
	    x.forEach(p->System.out.println("FOR EACH METHOD VALUE "+p));
	}
	
	

}
