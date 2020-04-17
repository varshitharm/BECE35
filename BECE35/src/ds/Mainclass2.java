package ds;

class Shoe
{
	String brand;
	double cost;
	String color;
	
	public Shoe(String brand, double cost, String color) 
	{
		super();
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}
	
	@Override
	public String toString() 
	{
		String res = brand + " " + cost + " "+color;
		return res;
	}
}

class Book
{
	String title;
	double cost;
	String author;
	
	public Book(String title, double cost, String author) 
	{
		super();
		this.title = title;
		this.cost = cost;
		this.author = author;
	}
	
	@Override
	public String toString() 
	{
		String res = title + " " + cost + " "+author;
		return res;
	}
}


class Cart
{
	Object[] crt = new Object[4];
	int index = 0;
	
	public void addToCart(Object obj)
	{
		crt[index] = obj;
		index++;
	}
	
	@Override
	public String toString() 
	{
	  String res = "";
	  for (int i = 0; i < crt.length; i++) 
	  {
		res = res +" "+crt[i];
	  }
	  
	  return res;
	}
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
       Cart c1 =new Cart();
       
       Book b1 = new Book("java",250.45,"oracle");
       Shoe s1 = new Shoe("Puma",1422.4,"black");
       
       c1.addToCart(b1);
       c1.addToCart(s1);
       
      System.out.println(c1);
       
	}
}



