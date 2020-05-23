package packageexam2;

public class StaticBlocksExample {

	public StaticBlocksExample() {
		System.out.println("Static block example");
	}
	
	static int x=2;
	static int y;
	
     static
     {
    	 int x=4;
    	 y=x;
     }
     
     public void calculation()
     {
    	 int a=1;
    	 int b=2;
    	 int c=3;
    	 
    	 System.out.println((c/b)+c^2);
    	 System.out.println("***************** L value ********************");
    	 for(int l=0;l<5;System.out.println("value of l is "+l))l++;
    	 
    	 System.out.println("************* Check the String values ******************");
    	 
    	 String S1="tejas";
    	 // String S2=new String("tejas");
    	 String S2="tejas";
    	 System.out.println(S1.equals(S2));
    	 System.out.println(S1==S2);
     }
     
     public static void main(String args[])
     {
    	 System.out.println("Values are "+x+y);
    	 StaticBlocksExample obj = new StaticBlocksExample();
    	 obj.calculation();
     }

}
