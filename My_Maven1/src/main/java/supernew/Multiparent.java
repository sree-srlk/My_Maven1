package supernew;

public class Multiparent extends Multigrand 
{
   int hra;
   int pf;
  public Multiparent()
  {
	  super(8000,1000,3000);
	  
	  hra=basicpay*5/100;
	  pf=basicpay*20/100;
	  System.out.println("hra "+hra+"pf "+pf);
  }
}
