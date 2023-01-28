package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Colours 
{
	

	public static void main(String[]args)
	{
		ArrayList<String> ob=new ArrayList();
		ob.add("RED");
		ob.add("BLUE");
		ob.add("GREEN");
		ob.add("YELLOW");
		ob.add("BLACK");
		System.out.println("COLORS ARE "+ob);
		Iterator<String> itr=ob.iterator();
		System.out.println("ITERATED " +ob);
		ob.remove(3);
		System.out.println("After deletion "+ob);
	{
		String s="RED";
		System.out.println("Search the color "+s);
	  for(int i=0;i<ob.size();i++)
		 if(s==ob.get(i))
		 {
			System.out.println("color found"); 
		 }
		 else
		 {
			 System.out.println("color not found");
		 }
	}
			
	}
	

}
