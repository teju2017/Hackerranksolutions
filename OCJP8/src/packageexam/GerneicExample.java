package packageexam;

public class GerneicExample<T> {
	
	private T t;
	
	
	public GerneicExample(T t)
	{
		this.t=t;
		System.out.println("Value of t is "+t);
	}
	
    public void example(T t)
    {
    	System.out.println("Number is "+t);
    }

}
