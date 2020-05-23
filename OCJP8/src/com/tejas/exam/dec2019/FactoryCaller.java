package com.tejas.exam.dec2019;

public class FactoryCaller {
	
	private String countryCode;
	
	
	public DetailsRequired returnObject(String country)
	{
		  if(country.contentEquals("US"))
		  {
			  return new USD();
		  }
		  if(country.contentEquals("INDIA"))
		  {
			  return new India();
		  }
		  if(country.contentEquals("CHINA"))
		  {
			  return new China();
		  }
		  else
		  {
			  return new UnknownCountry();
		  }
		
	}

}
