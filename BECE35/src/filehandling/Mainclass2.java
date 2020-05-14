package filehandling;

import java.io.File;
import java.io.IOException;

public class Mainclass2
{
	public static void main(String[] args)
	{
		String path = "C:/FILEDEMO/demo.txt";
		File f1 = new File(path);

		if (f1.exists() != true)
		{
			try 
			{
				f1.createNewFile();
				System.out.println("file created");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		else 
		{
			System.out.println("File alread exists");
		}
	}
}
