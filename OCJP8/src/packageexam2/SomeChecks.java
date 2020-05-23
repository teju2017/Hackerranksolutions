package packageexam2;

import java.time.LocalDate;

public class SomeChecks {
	
	private int y1;
	public static int marks=40;
	public String s="Sup";
	
	public void catcher(String S1)
	{
	    S1+=S1;
	    S1+="SUPPPPPPER";
	    System.out.println("Value of S1 is "+S1);
	    System.out.println("Value of s is "+s);
	}

	public SomeChecks() {
		System.out.println("Constructor called");
	}
	
	public void localDateChecks()
	{
		LocalDate date = LocalDate.ofYearDay(2015, 363);
		date.plusWeeks(2);
		System.out.println(date+"  "+date.isLeapYear());
		
		LocalDate id = LocalDate.of(2010,10,10);
		int days=id.lengthOfMonth();
		System.out.println("value is "+days);
	}
	
	static {int  y=100; System.out.println("Value of Y is "+y);};
	
	
	static { System.out.println("Am displaying the value "+marks);};
	
	static { marks=marks-13;System.out.println("Marks value is "+marks);};
	
	{ y1=1000;System.out.println("Value of y1 is "+y1);};
	
	{ int z=100;
	   System.out.println("am checking here "+z);
	}
	
	public void main(String s)
	{
		System.out.println("Value of s passed is "+s);
	}
	
	
	
	
	public static void main(String args[])
	{
		SomeChecks abc = new SomeChecks();
		abc.main("Tejas is working");	
		abc.catcher("Just checking");
		abc.localDateChecks();
	}

}
