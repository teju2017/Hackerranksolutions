package com.tejas.exam.dec2019;

public class Caller {
	
	private static String country;
	
	public static void validate(String par[])
	{
		if(par.length != 1)
		{
			System.out.println("Please pass the country code as parameters" );
			System.exit(-1);
		}
		else
		{
			country=par[0];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(args);
		FactoryCaller fact = new FactoryCaller();
	    DetailsRequired det=fact.returnObject(Caller.country);
	    System.out.println("Currency = "+det.getCurrency()+"   GDP = :"+det.getGDP());

	}

}
