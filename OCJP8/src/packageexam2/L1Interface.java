package packageexam2;

public interface L1Interface {
	
	public default Object abc()
	{
		return true;
	}
	
	public static String teju()
	{
		System.out.println("Checking the script");
		return "From a static method inside the L1Interface";
	}

}
