package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass7 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");

		Runnable r1 = () -> 
		{
			System.out.println("task one executed");
		};

		Runnable r2 = () -> 
		{
			System.out.println("task two executed");
		};

		Runnable r3 = () -> 
		{
			System.out.println("task three executed");
		};
		
		ExecutorService ref = Executors.newSingleThreadExecutor();
        ref.submit(r1);
        ref.submit(r2);
        ref.submit(r3);

		System.out.println("Main Ends...");
	}
}





