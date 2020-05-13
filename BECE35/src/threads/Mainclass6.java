package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mainclass6 
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

		ScheduledExecutorService ref = Executors.newScheduledThreadPool(3);
		ref.schedule(r1, 3, TimeUnit.SECONDS);

		ScheduledExecutorService ref2 = Executors.newScheduledThreadPool(3);
		ref2.scheduleAtFixedRate(r2, 0, 3, TimeUnit.SECONDS);

		ScheduledExecutorService ref3 = Executors.newScheduledThreadPool(3);
		ref3.scheduleWithFixedDelay(r3, 0, 3, TimeUnit.SECONDS);

		System.out.println("Main Ends...");
	}
}
