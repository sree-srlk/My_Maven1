package test;

public class Details 
{
	String name;
	int id;
	float lisenceno;
	
	public void log(String name)
	{
		this.name=name;
		System.out.println("Student name "+name);
	}
	public void log(int id)
	{
		this.id=id;
	System.out.println("Employee id "+ id);	
	}
	public void log(float lisenceno)
	{
		this.log("sree");
		this.log(23);
		this.lisenceno=lisenceno;
		System.out.println("car license no "+ lisenceno);
	}

	public static void main(String[] args) 
	{
		Details d=new Details();
		d.log(35678.56f);
		
		
	

	}

}
