package packageexam;

public interface Displayinterface {
	
	public void showdata();
	
	
	default public void checking()
	{
		System.out.println("Its working well");
	}


}
