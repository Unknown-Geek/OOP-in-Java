
import java.util.Scanner;
import java.io.*;

public class TryCatch
{
	public static void main(String args[])
	{
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter array elements : ");
			for(int i = 0; i < 6; i++)
			{
				arr[i] = sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Entered the finally block.");
		}
	}
}