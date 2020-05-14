package threads;

class Counter
{
	private int v1 = 0;
	
	synchronized public void increment()
	{
		v1++;
	}
	synchronized public void decrement()
	{
		v1--;
	}
	synchronized public void showValue()
	{
		System.out.println("v1= "+v1);
	}
}

public class Mainclass8 
{
	public static void main(String[] args) 
	{
	   Counter c1 = new Counter();
	   
       Runnable r1 = () ->
       {
    	 c1.increment();
    	 c1.showValue();
       };
       
       Runnable r2 = () ->
       {
    	 c1.decrement();
    	 c1.showValue();
       };
       
       Thread t1 = new Thread(r1);
       Thread t2 = new Thread(r2);
       
       t1.start();
       t2.start();
       
	}
}








