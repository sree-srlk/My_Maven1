package supernew;

public class Child 
{
   String house;
   int pin;
   Parent sd;
  public Child(String house,int pin,Parent sd)
  {
	  this.house=house;
	  this.pin=pin;
	  this.sd=sd;
  }
  public void print()
  {
	  System.out.println(sd.name+" "+sd.age);
	  System.out.println(house+" "+pin);
  }
	public static void main(String[] args)
	{
   Parent p=new Parent("SREE",25);
   Child c=new Child("Sreenilayam",695020,p);
   c.print();
	}

}
