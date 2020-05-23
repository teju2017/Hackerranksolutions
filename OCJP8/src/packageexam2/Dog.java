package packageexam2;

public class Dog extends Animal {

	public Dog() {
		System.out.println("SubClass Constructor:Barking ");
	}
	
	
	public void eat()
	{
		super.eat();
		System.out.println("Sub class");
		
	}
	
	
	public void Dogeat()
	{
		System.out.println("This is a dog eat");
	}
	
	
	public static void main(String args[])
	{
		Dog g = new Dog();
		//g.eat();
		Animal ab = (Animal)g;
		System.out.println("### Calling with the Superclass method");
		ab.eat();
		Animal a1 = g;
		a1.eat();
		g.Dogeat();
		System.out.println("### Calling with the Subclass method");
		g.eat();
	}
	
	

}
