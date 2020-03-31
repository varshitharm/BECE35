package stringbuffer;

public class Mainclass 
{
	public static String test(String str)
	{
		String res = "";
		
		for(int i=0; i<=(str.length()-1)/2; i++)
		{
			res = res + str.charAt(i);
			System.out.println(res);
		}
		
		return res;
			
	}
	public static void main(String[] args) 
	{
      String s1 = "aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccc";
      System.out.println(test(s1));
	}
}




