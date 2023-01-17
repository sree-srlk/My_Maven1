package supernew;

public class Super2 extends Super1
{
	int x=50;
	int y=40;
	public void add1()
	{
		int sum=x+y;
		System.out.println("sum= " +sum);
		System.out.println(super.x);
	}

	public static void main(String[] args) 
	{
		Super2 ob=new Super2();
		ob.add();
		ob.add1();

	}

}
