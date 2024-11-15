
import java.util.Scanner;
import java.io.*;

public class FileExceptionHandling
{
	File file;
	FileReader reader;
	FileWriter writer;

	public static void main(String args[])
	{
		boolean running = true;
		char ch;
		String data;
		String readfile, writefile;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter filename to read from : ");
		readfile = sc.nextLine();
		System.out.print("Enter filename to write into : ");
		writefile = sc.nextLine();
		try(FileReader reader = new FileReader(readfile))
		{
			Scanner r = new Scanner(reader);			
			FileWriter writer = new FileWriter(writefile);
			
			System.out.println("\nContents of the file : ");
			while(true)
			{
				try
				{
					data = r.nextLine();
					data = data+"\n";
					System.out.print(data);
					writer.write(data);
				}
				catch(Exception e)
				{
					break;
				}
			}
			System.out.println("\nData successfully copied");
			writer.close();
			reader.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}			
	}
}