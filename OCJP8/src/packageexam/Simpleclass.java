package packageexam;

public class Simpleclass {
	
	public static void main(String args[]) throws ClassCastException
	{
		
		Lockdown sgl = SingletonImpl.retvobject();
		sgl.mainmethod();
		Lockdown sgl2 = SingletonImpl.retvobject();
		sgl2.mainmethod();
		sgl2.mainmethod();

		if(sgl == null)
		{
			System.out.println("No object returned and hence exiting ");
		}
		int x=sgl.hashCode();
		int y=sgl2.hashCode();
		if(x==y)
		{
			System.out.println("x and y hashcodes are the same, Hashcode values are x= "+x+"  y="+y);
		}
		else
		{
			System.out.println("x and y hashcodes are not the same and their values "+x+"     "+y);
		}
		System.out.println("Calling some methods");

	
	
	}

	

}
