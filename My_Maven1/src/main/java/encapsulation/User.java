package encapsulation;
import java.util.Scanner;

public class User 
{

	public static void main(String[] args)
 {
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
	    int a=sc.nextInt();
	 b.setPin(a);
	 b.validate();
	 System.out.println(b.getPin());
	 

	}

}
