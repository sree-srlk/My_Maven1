package exception;

public class New 
{
	static int a=10;

	public static void main(String[] args)
	{
		try {
		int b=10/2;
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Exception");
		}
		finally {
			System.out.println("end");
		}
		}
	}


