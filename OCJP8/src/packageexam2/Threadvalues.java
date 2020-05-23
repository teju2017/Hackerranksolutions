package packageexam2;

public class Threadvalues implements Runnable {
	
	private String threadName;
	private Thread t;
	
	public Threadvalues(String threadName)
	{
		this.threadName=threadName;
	}
	
	public void run() 
	{
		while(true)
		{
			System.out.println(threadName);
		}
	}
	
	public void start() throws Exception
	{
		if (t == null)
	      {
	         t = new Thread(this,threadName);
	         t.start();
	         t.sleep(10000);
	      }
	   
	}
	
	public static void main(String args[]) throws Exception
	{
		Threadvalues a = new Threadvalues("A");
		Threadvalues b = new Threadvalues("B");
		a.start();
		b.start();
		
	}
	
	

}
