package filehandling;

import java.io.File;
import java.io.FileReader;

public class Mainclass4 
{

	public static void main(String[] args) 
	{
		String path = "C:/FILEDEMO/demo.txt";
		File f1 = new File(path);
		
		try 
		{
			FileReader fr = new FileReader(f1);
			int len = (int) f1.length();
			char[] c1 = new char[len];
	        fr.read(c1);
			System.out.println(c1);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
