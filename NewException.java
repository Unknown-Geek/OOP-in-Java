
import java.util.Scanner;

class CustomException extends Exception
{
	CustomException(String message)
	{
		super(message);
	}
}

public class NewException 
{
	public void validate(int age) throws CustomException
	{
		if (age < 18)
			throw new CustomException("Invalid age to vote.");
		else
			System.out.println("Valid age to vote.");
	}

	public static void main(String args[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		NewException newException = new NewException();
		System.out.print("Enter your age : ");
		age = sc.nextInt();
		try
		{
			newException.validate(age);
		}
		catch (CustomException e)
		{
			System.out.println(e);
		}
	}
}