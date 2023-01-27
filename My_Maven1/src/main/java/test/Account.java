package test;

public class Account 
{
	private int depamnt;
	private int accntno;
	
	
	public void get() 
	{
		depamnt=5000;
		accntno=456;
	}
	public void set() 
	{
	System.out.println("deposit amount "+depamnt);	
	System.out.println("account no "+accntno);
	}
}

