package filehandling;

import java.io.File;

public class Mainclass 
{
   	public static void main(String[] args) 
	{
   	   String path = "C:/FILEDEMO";
	   File f1 = new File(path);
	   
	   if(f1.exists() != true)
	   {
	     f1.mkdir();
	     System.out.println("folder created");
	   }
	   else
	   {
		 System.out.println("Folder alread exists");
	   }

	}
}
