package com.tejas.interview;

import java.util.LinkedList;

public class ProducerConsumerImpl{
	
	public int size = 3;
	public LinkedList<Integer> count = new LinkedList<>();
	public int value=0;
	
	public void produce() throws InterruptedException
	{
		synchronized(this)
	    {
			try
			{
				System.out.println("Size value in the Producer is "+count.size());
				if(count.size() == size)
				{
				   System.out.println("################ SIZE IS FULL, WILL BE WAITING FOR THE CONSUMER RESPONSE ######## ");
				   wait();
				}
				System.out.println("VALUE="+value);
				count.add(value++);
				System.out.println("A value has been added by the producer");
				if(count.size() == 3)
				{
			     notify();
			     Thread.sleep(1000);
				}
			}
			catch(Exception ae)
			{
				System.out.println("Exception in the producer thread "+ae.getMessage());
			}
			
	 }

	
	}
	
	
	public void comsumer() throws InterruptedException
	{
		
		synchronized(this)
		 {
			try
			{
				System.out.println("Size value in the Consumer is "+count.size());
				if(count.size() == 0)
				{
				   System.out.println("################ CONSUMER IS EMPTY, WILL BE WAITING FOR THE PRODUCER RESPONSE ##############");
				   wait();
				}
				
				Integer x=count.removeFirst();
				
				System.out.println("The value removed from the linked list is "+x.intValue());
				if(count.size() == 0)
				{
			      notify();
			      Thread.sleep(5000);
				}
			    
			}
			catch(Exception ae)
			{
				System.out.println("Exception in the producer thread "+ae.getMessage());
			}
			
		 }

	
	}

}
