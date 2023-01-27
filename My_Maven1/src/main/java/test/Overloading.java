package test;

public class Overloading 
{
	public static void details(String a)
	{
		System.out.println("Student Name "+a);
	}
	public static void details(float id)
	{
		System.out.println("Employee id "+id);
	}
	public static void details(int no)
	{
		System.out.println("Car License "+no);
	}

	public static void main(String[] args)
	{
		Overloading.details("SREE");
		Overloading.details(456f);
		Overloading.details(456);

	}

}
