package packageexam2;

public class ChildAbstractClass  extends AbstractParent {

	@Override
	Integer tejas() throws NumberFormatException {
	    System.out.println("Implementing the Abstract methods");
	    return new Integer(10);
		
	}
	
	public static void main(String args[])
	{
		ChildAbstractClass abcd = new ChildAbstractClass();
		Integer abc=abcd.tejas();
		System.out.println("value of abc is "+abc);
	}

}
