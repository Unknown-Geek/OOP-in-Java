
import java.util.*;

public class StringTokenizerExample
{
	public static void main(String args[])
	{
		int sum = 0,num;
		String numbers;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string of numbers : ");
		numbers = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(numbers);
		while(tokenizer.hasMoreTokens())
		{
			num = Integer.parseInt(tokenizer.nextToken());
			sum+=num;
		}
		System.out.println("Sum : "+sum);
	}
}