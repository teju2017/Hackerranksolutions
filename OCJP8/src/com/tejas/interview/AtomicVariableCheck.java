package com.tejas.interview;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableCheck implements Runnable {
	
	 public AtomicInteger ints = new AtomicInteger(0);
	
	public int a=0;
	
	public AtomicVariableCheck()
	{
		System.out.println("AtomicVariable checks");
	}
	
	
	/* This method basically increments the 
	 * atomic variable and gives a constant value
	 */
	
	public int incrementer()
	{
		return(ints.incrementAndGet());
	}
	
	/*  Below menthod increments a 
	 *  normal int value to show the difference
	 */
	
	public int incrementvar()
	{
		return a++;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int a=0;a<10;a++)
		{
			try
			{
			incrementer();
			System.out.println("NORMAL INT VALUE "+incrementvar()+ " "+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("ATOMIC INTEGER VALUE is "+Thread.currentThread().getName()+"  Value of ints is "+ints);
			}
			catch(Exception ae)
			{
				System.out.println("Exception object is "+ae.getMessage());
			}
		}
	}
	
	
	public static void main(String args[])
	{
		AtomicVariableCheck chk = new AtomicVariableCheck();
		Thread t1 = new Thread(chk);
		Thread t2 = new Thread(chk);
		Thread t3 = new Thread(chk);
		t1.setName("THREAD ONE");
		t2.setName("THREAD TWO");
		t3.setName("THREAD THREE");
		t1.start();
		t2.start();
		t3.start();
	}

}
