
import java.util.Scanner;
import java.io.*;

public class FileCount
{
	FileReader reader;

	public static void main(String args[])
	{
		String line;
		String filename;
		int lines_count = 0, words_count = 0, char_count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the filename : ");
		filename = sc.nextLine();
		
		try(FileReader reader = new FileReader(filename))
		{
			Scanner r = new Scanner(reader);
			while(true)
				try
				{
					line = r.nextLine();
					lines_count++;
					String[] words = line.split(" ");
					for(String word : words)
					{
						int len = word.length();
						for(int i = 0; i < len ; i++)
						{
								char_count++;
						}
						words_count++;
					}
									}
				catch(Exception e)
				{
					break;
				}
		}
		catch(Exception e)
		{
			System.out.println("File does not exist.");
		}
		
		System.out.println("Number of Lines : "+lines_count);
		System.out.println("Number of words : "+words_count);
		System.out.println("Number of characters : "+char_count);	
	}
}