package collections;

import java.util.HashSet;

public class Mainclass3
{
	public static void main(String[] args) 
	{
       HashSet h1 = new HashSet();
       h1.add("java");
       h1.add(null);
       h1.add("python");
       h1.add("java");
       h1.add("html");
       h1.add(null);
       h1.add("spring");
       h1.add("hibernate");
       
       System.out.println(h1);
       
	}
}
