/* Nice example of a producer, consumer
 * The output can be varied by changing the thread sleep
 * Example clearly demonstrates the wait and notify
 * 
 */
package com.tejas.interview;


public class ProdConsumer implements Runnable {
	

	ProducerConsumerImpl pci;
	
	public ProdConsumer()
	{
		System.out.println("Just a basic constructor");
		this.pci=new ProducerConsumerImpl();
	}

	@Override
	public void run() {
		
		for(int l=0;l<12;l++)
		{
			try
			{
			   if(Thread.currentThread().getName().contentEquals("THREAD ONE"))
			   {
			      pci.produce();
			   }
			   else
			   {
			      pci.comsumer();
			   }
			}
			catch(Exception ae)
			{
				System.out.println("Exception object value is "+ae.getMessage());
			}
		}
		
	}
	
	public static void main(String args[])
	{
		ProdConsumer prd = new ProdConsumer();
		Thread t1 = new Thread(prd);
		Thread t2=  new Thread(prd);
		// ProducerConsumerImpl pci = new ProducerConsumerImpl();
		t1.setName("THREAD ONE");
		t2.setName("THREAD TWO");
		t2.start();
	    t1.start();
	    System.out.println("Thread name is "+t1.getName());
	    System.out.println("Thread name is "+t2.getName());
	}

}
