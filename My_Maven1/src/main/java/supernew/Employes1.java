package supernew;

public class Employes1 
{
 String company;
 int salary;
 Employes sd;
 public Employes1(String company,int salary,Employes sd)
 {
	 this.company=company;
	 this.salary=salary;
	 this.sd=sd;
 }
 public void print()
 {
	 System.out.println(sd.name+" "+sd.id);
	 System.out.println(company+" "+salary);
 }
	public static void main(String[] args) 
	{
     Employes e=new Employes("SREE",23567);
     Employes1 em=new Employes1("ABC",50000,e);
     em.print();
     
	}

}
