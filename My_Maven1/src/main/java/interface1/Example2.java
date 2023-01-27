package interface1;

public class Example2 implements Example,Inter1
{
   
	public static void main(String[] args) 
	{
      Example2 e= new Example2();
      e.print();
      e.print1();
	}

	public void print()
	
	{
	  System.out.println("HELLOW");
		
	}

	public void print1() 
	{
		System.out.println("hiiii");
		
	}

}
