package packageexam;

public class SingletonImpl {
	
	public static Lockdown object;
	
	public static Lockdown retvobject()
	{
		if(object == null )
		{
			object=new Lockdown();
			return object;
		}
		else
		{
			return object;
			// return new Lockdown();
		}
	}

}
