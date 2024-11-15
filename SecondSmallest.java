
import java.util.Scanner;
public class SecondSmallest
{
	public static void main(String args[])
	{
		int smallest = 0,second_smallest = 0;
		int n;
		int temp;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of elements in array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i<n ; i++)
		{
			System.out.print("Enter element at " + i + " : ");
			arr[i] = sc.nextInt();
		}

		if (n == 1)
			System.out.println("Only one element present in array.");
			

		else if (n == 2)
		{
			second_smallest = arr[0]<arr[1] ? arr[1] : arr[0];
			System.out.println("Second smallest element : " + second_smallest);
		}
		
		else
		{
			for (int i = 0 ; i<n ; i++)
			{
				for (int j = 0; j<n-i-1; j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;				
					}	
				}
			}
			smallest = arr[0];
			for (int k=1; k<n ; k++)
			{
				if (arr[k]!=smallest)
				{
					second_smallest = arr[k];
					break;
				}
			}
			System.out.println("Second Smallest Element : " + second_smallest);
		}
	}
}