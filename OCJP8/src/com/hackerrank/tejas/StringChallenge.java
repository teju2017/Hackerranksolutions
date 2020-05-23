package com.hackerrank.tejas;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class StringChallenge {
	
	public static void main(String args[])
	{
    	String A="hello";
	    String B="world";
	    int total;
	    total=A.length()+B.length();
	    System.out.println("The total is "+total);
	    String first = A.substring(0,1).toUpperCase()+A.substring(1);
	    String Second = B.substring(0,1).toUpperCase()+B.substring(1);
	    System.out.println(first+" "+Second);
	    String l="Helloworld";
	    System.out.println("L value ="+l.substring(3,7));
	    LocalDate locdate = LocalDate.of(2008,11,5);
	    DayOfWeek day = DayOfWeek.from(locdate);
	    System.out.println("day is "+day);
}
	    		

}
