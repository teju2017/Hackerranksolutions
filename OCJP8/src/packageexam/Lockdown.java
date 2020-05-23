package packageexam;

import packageexam.Lockdown.Working.Onemore;

public class Lockdown {
	
	private String startdate;
	private String country;
	private String enddate;
	public int x;
	
	static class Working
	{
		Lockdown lck = new Lockdown();
		public void getValue() throws NullPointerException
		{
			System.out.println("Inside the static class "+lck.startdate+"     "+lck.enddate+"          "+lck.country);
		}
		
		public static void valuemessage()
		{
			System.out.println("Value message is ");
		}
		
		public static class Onemore
		{
			public Onemore()
			{
				System.out.println("One more level of nesting of the class");
			}
		}
	}
	
	public void mainmethod()
	{
		x=x+2;
		System.out.println("Main method value "+x);
	}
	
	public void getvalue()
	{
		System.out.println("Not in the Static class");
	}
	
	public static void main(String args[])
	{
		Lockdown lck = new Lockdown();
		lck.getvalue();
		lck.mainmethod();
		Working wrk = new Working();
		wrk.getValue();
		Lockdown.Working.valuemessage();
		Onemore onemore = new Onemore();
		
	
	}

}
