package collections;

import java.util.ArrayList;

public class Mainclass 
{
	public static void main(String[] args) 
	{
      ArrayList a1= new ArrayList();
      a1.add(10);     // X a1[0] = 78;
      a1.add(true);
      a1.add(30);
      a1.add("hello");
      a1.add(2.5);
      
      System.out.println(a1);
      
      System.out.println(a1.get(1));
      
	}
}
