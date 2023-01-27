package test;

public class Details2 extends Details1
{
	int bonus=2000;
	public void bonus()
	{
		super.details();
		System.out.println("BONUS ");
	}

	public static void main(String[] args)
	{
	  Details2 d=new Details2();
	  d.bonus();

	}

}
