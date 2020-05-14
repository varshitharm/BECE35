package threads;

public class Mainclass10 
{
	static String s1 = new String("hello");
	static String s2 = new String("world");

	public static void main(String[] args) 
	{
		Runnable r1 = () -> 
		{
			System.out.println("t1 starts...");

			System.out.println("t1 waiting to lock s1");

			synchronized (s1) 
			{
				System.out.println("t1 locked s1");
                
				try 
				{
					System.out.println("t1 paused to wait state");
					s1.wait(4000);
					System.out.println("t1 resume from wait state");
				} 
				catch (InterruptedException e) 
				{					
					e.printStackTrace();
				}
				
				
				
				System.out.println("t1 waiting to lock s2");

				synchronized (s2) 
				{
					System.out.println("t1 locked s2");
				}

				System.out.println("t1 unlocked s2");

			}

			System.out.println("t1 unlocked s1");

			System.out.println("t1 ends...");
		};
		
		Runnable r2 = () -> 
		{
			System.out.println("t2 starts...");

			System.out.println("t2 waiting to lock s2");

			synchronized (s2) 
			{
				System.out.println("t2 locked s2");

				System.out.println("t2 waiting to lock s1");

				synchronized (s1) 
				{
					System.out.println("t2 locked s1");
				}

				System.out.println("t2 unlocked s1");

			}

			System.out.println("t2 unlocked s2");

			System.out.println("t2 ends...");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
