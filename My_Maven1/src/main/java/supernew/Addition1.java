package supernew;

public class Addition1 extends Addition
{
	public Addition1()
	{
		super(10,25);
		if(sum%10==0)
		{
			System.out.println("Divisible");
		}
			else
			{
				System.out.println("Not Divisible");
			}
				
		}

	public static void main(String[] args)
	{
	 Addition1 ob=new Addition1();

	}

}
