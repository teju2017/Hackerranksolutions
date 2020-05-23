package packageexam2;

public class LiteralRelated {

	public LiteralRelated() {
		// TODO Auto-generated constructor stub
		System.out.println("Its working well");
	}
	
	public void switchCheck(String Check)
	{
		
		System.out.println("****************"+Check+"*****************");
		String s="A";
		String c1="A";
		String c2="B";
		String c3="C";
		
		switch(s)
		{
		case "A":System.out.println("working ok");
		          // break;
		default:System.out.println("Default value");
		case "B": System.out.println("working fine");
		           break;          
		
		}
	}
	
	public void incredecre(String Check)
	{
		System.out.println("Common message is "+Check);
		int z=10;
		if(--z==9)
		{
			System.out.println("Value is decremented before comparison");
		}
		System.out.println("Value is"+z);
		
		if(true&&++z==10)
		{
			System.out.println("it  is successful, value of z is "+z);
		}
		
		System.out.println("Value of z before decrementing "+z);
		
		
		if ( true ||--z==9)
		{
			System.out.println("||  it works"+z);
		}
		
		
		System.out.println("value of z after the second check is "+z);
		
		/* For loop , Checking the values
		 */
		
		System.out.println("For loop checking the values");
		
		for(int i=0,j=5;i<j;i++);
		
		for(int i=0,j=5;i<j;i++, System.out.println("FOR LOOP CHECKING VALUE "+i));
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Value is working");
		new LiteralRelated().switchCheck("Checking the switch value case");
		new LiteralRelated().incredecre("Checking the increment and decrement operator");
		
	}

}
