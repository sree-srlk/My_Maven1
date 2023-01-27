package nonacess;

public class Contractor extends Employee
{
	public void calculatesalary()
	{
		int salary=ph*wh;
		System.out.println("PAYMENT= "+salary);
	}

	public static void main(String[] args)
	{
	Contractor c=new Contractor();
	c.calculatesalary();

	}

}
