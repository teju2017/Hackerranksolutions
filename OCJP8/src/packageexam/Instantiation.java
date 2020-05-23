package packageexam;

public class Instantiation extends Justsample {

	@Override
	void checkvalue() {
		System.out.println("Extending the abstract class");
		
	}
	
	public Instantiation(String temp)
	{
		System.out.println("Instantiation constructor "+temp);
	}
	
	public static void main(String args[])
	{
		Instantiation inst = new Instantiation("working");
		inst.checkvalue();
		inst.workExample();
		
	}
	
	

}
