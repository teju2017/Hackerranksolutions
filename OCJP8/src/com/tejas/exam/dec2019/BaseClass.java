package com.tejas.exam.dec2019;

public class BaseClass extends SuperClass {

	public BaseClass() {
		super();
		System.out.println(" BASE CLASS CONSTRUCTOR ");
	}
	
	@Override
	public void working()
	{
		System.out.println("Base class: workng method");
	}
	
	
	public void checkit(int x)
	{
		System.out.println("Base class : Checkit method: "+x);
	}
	
	public void workingWell()
	{
		System.out.println("Base class : Only the Baseclass method");
	}

	public static void main(String[] args) throws ExceptionHandler {
		// TODO Auto-generated method stub
       SuperClass obj = new SuperClass();
       obj.working();
       obj.checkit(100);
       System.out.println("######### BASE OBJECT CREATION #############");
       BaseClass obj1 = new BaseClass();
       obj1.working();
       obj1.checkit(1234);
       obj1.workingWell();
       System.out.println("######### Super class variable, base object creation #############");
       SuperClass sup = new BaseClass();
       sup.working();
       System.out.println("######### Base class variable, Super object creation and then typecasting to baseclass #############");
       try 
       {
         //  BaseClass bas = (BaseClass)new SuperClass(); //  Hitting the exception
         // bas.working();
         // bas.checkit(200);
       }
       catch( Exception ae)
       {
    	   System.out.println("Exception is hit "+ae.getMessage());
    	   throw new ExceptionHandler();
       }
		
	}

}
