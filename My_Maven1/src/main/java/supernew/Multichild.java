package supernew;

public class Multichild extends Multiparent
{
 public void salaryslip()
 {
	 
	 int salary=basicpay+hra-pf-deduction+bonus;
	 System.out.println("salary "+salary);
 }
	public static void main(String[] args) 
	{
     Multichild ob=new Multichild();
     ob.salaryslip();
	}

}
