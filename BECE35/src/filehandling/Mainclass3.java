package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		String path = "C:/FILEDEMO/demo.txt";
		File f1 = new File(path);
		
		try 
		{
			FileWriter fw = new FileWriter(f1);
			fw.write("this is file handling class");//writes data to stream
			fw.flush();//writes data from stream to file
			System.out.println("File writting complete");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}


