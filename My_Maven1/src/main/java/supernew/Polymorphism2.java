package supernew;

public class Polymorphism2 extends Polymorphism1
{
	public void print()
	{
		super.print();
		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		Polymorphism2 s=new Polymorphism2();
		s.print();

	}

}
