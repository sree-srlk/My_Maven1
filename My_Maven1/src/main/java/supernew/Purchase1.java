package supernew;

public class Purchase1 extends Purchase
{
 public void discount()
 {
	 super.discount();
	 int discount=purchase*15/100;
	 System.out.println("Ofseason Discount "+discount);
 }
	public static void main(String[] args) 
	{
	 Purchase1 sc=new Purchase1();
	 sc.discount();

	}

}
