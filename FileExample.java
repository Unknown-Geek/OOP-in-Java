
import java.io.*;
import java.util.Scanner;

public class FileExample
{
	File file;
	FileReader reader;
	FileWriter writer;

	public static void main(String args[])
	{
		boolean running = true;
		char ch;
		String data;
		String filename;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the filename : ");
		filename = sc.nextLine();
		
		try(FileWriter writer = new FileWriter(filename))
		{
			while(running)
			{
				System.out.print("Enter data to write into file : ");
				data = sc.nextLine();
				data = data+'\n';
				writer.write(data);
				System.out.print("Enter '0' to stop writing : ");
				ch = sc.next().charAt(0);
				sc.nextLine();
				if (ch == '0')
				{
					running = false;
					break;
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("Error in writing into file.");
		}

		try(FileReader reader = new FileReader(filename))
		{
			Scanner r = new Scanner(reader);
			System.out.println("\nData from the File : ");
			
			while(true)
				try
				{
					data = r.nextLine();
					data = data + '\n';
					System.out.print(data);
				}
				catch(Exception e)
				{
					break;
				}
		}
		catch(IOException e)
		{
			System.out.println("Error in reading from file.");
		}		
	}
}