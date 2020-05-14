package threads;

public class Mainclass9 
{
	static String s1 = new String("hello");

	public static void main(String[] args) 
	{
		Runnable r1 = () -> 
		{
			synchronized (s1) 
			{
				s1 = s1.concat("world");
				System.out.println(s1);
			}
		};

		Runnable r2 = () -> 
		{
			synchronized (s1) 
			{
				s1 = s1.concat("java");
				System.out.println(s1);
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

	}
}
