package packageexam2;

public class L1InterImplementation implements L1Interface 
{
   public Object equals() 
   {
	   return true;
   }
  
   public void binaryCalculate()
   {
	   int x=0b1;
	   int y=0xF;
	 
	   int a=10;
	   Double b=10.0;
	   Integer c=10;
	   
	   System.out.println("Comparison between int and Double "+(a==b) + "  ******Comparison between int and Integer "+(a==c));
	   
	   Double d1=0.0;
	   System.out.println("Value of Double is "+d1.BYTES);
	   System.out.println("Value of Double is "+d1.SIZE);
   }
   
   
   public int checker(int x)
   {
	   x=2;
	   return x;
   }
	   
   
   public void stringBuilder()
   {
	   StringBuilder abc = new StringBuilder("teju");
	   abc.append("working");
	   System.out.println("Capacity ="+abc.capacity()+"  Length = "+abc.length());
   }
 

   public static void main(String args[])
   {
	   L1Interface alt = new L1Interface() {}; // This declaration works well 
	   L1InterImplementation ab = new L1InterImplementation();
	   L1Interface L1c = new L1InterImplementation();
	   System.out.println(alt.equals(ab)+ "   "+L1c.equals(ab));
	   System.out.println("calling the static method "+alt.abc()+" "+L1Interface.teju());
	   ab.binaryCalculate();
	   ab.stringBuilder();
   }
   
  	   
	   
   


}
