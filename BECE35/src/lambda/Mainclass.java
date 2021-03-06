package lambda;

@FunctionalInterface
interface Run 
{
	public void count(int num);
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Run r1 = (int num) -> 
		{
			System.out.println("lambda function");
			for (int i = 1; i <= num; i++) 
			{
				System.out.println(i);
			}
			return;
		};

		Run r2 = (int num) -> 
		{
			System.out.println("lambda function");
			for (int i = num; i >= 1; i--)
			{
				System.out.println(i);
			}
		};

		r1.count(5);
		r2.count(5);
	}
}
