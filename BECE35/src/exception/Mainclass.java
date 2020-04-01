package exception;

public class Mainclass 
{
	public static void test(int num)
	{
	  System.out.println("test() starts...");
	  
	  int res = 50 / num; //50 / 0
	  System.out.println("res = "+res);
	  
	  System.out.println("hello world");
	  
	  System.out.println("test() ends...");
	}
	
	public static void main(String[] args) 
	{
      System.out.println("main() starts...");
      
      test(0);
      
      System.out.println("main() ends...");
	}
}



