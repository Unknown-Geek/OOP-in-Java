
import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		int n, flag = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		System.out.println();
		for(int i = 2; i<n/2; i++)
		{
			if (n%i == 0)
			{
				flag ++;
			}
		}
		if (flag == 0 )
			System.out.println(n +" is a prime number");
		else
			System.out.println(n + " is not a prime number");
	}
}