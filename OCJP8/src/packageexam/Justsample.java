package packageexam;

public abstract class Justsample {
	
	abstract void checkvalue();
	
	public void workExample()
	{
		System.out.println("Displaying the values ");
	}
	
	
     public Justsample()
     {
    	 
    	 System.out.println("Default constructor");
     }
     
     public Justsample(String sample)
     {
    	 
    	 System.out.println("parameterized constructor "+sample);
     }


}
