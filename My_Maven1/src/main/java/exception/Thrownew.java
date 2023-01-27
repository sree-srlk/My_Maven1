package exception;

public class Thrownew 
{
	int age=15;
	public void licence()throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("eligible");
		}

		}
	
	

	public static void main(String[] args)
	{
		
		Thrownew th=new Thrownew();
		th.licence();
	}

}

