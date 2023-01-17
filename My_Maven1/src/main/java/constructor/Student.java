package constructor;

public class Student 
{
	String name;
	int sub1;
	int sub2;
	public Student(String a,int b,int c)
	{
		name=a;
		sub1=b;
		sub2=c;
	}
	public void print()
	{
		System.out.println(name+" "+sub1+" "+sub2+" ");
	}

	public static void main(String[] args)
	{
		Student ob=new Student("SREE",60,50);
		ob.print();
	

	}

}
