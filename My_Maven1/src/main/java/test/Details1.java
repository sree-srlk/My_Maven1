package test;

public class Details1 extends Employee
{
	String name="SREE";
	int age=25;
 public void details()
 {

	System.out.println("employee name = " +name);
	System.out.println("age "+age);
	System.out.println("salary" +super.salary);
 }
}
