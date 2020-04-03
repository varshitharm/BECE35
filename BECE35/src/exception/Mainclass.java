package exception;

public class Mainclass 
{
	public static void test(int num)//called
	{
	  System.out.println("test() starts...");
	  int[] a1 = {20,40,60};
	  
	  try
	  {
		System.out.println("array ele : "+a1[num]);
	    int res = 50 / num; //50 / 0
	    System.out.println("res = "+res);
	  }
	  catch(Exception e)
	  {
		e.printStackTrace();
	  }
	 
	  
	  System.out.println("hello world");
	  
	  System.out.println("test() ends...");
	}
	
	public static void main(String[] args)//calling 
	{
      System.out.println("main() starts...");
      
      test(5);
      
      
      System.out.println("main() ends...");
	}
}



