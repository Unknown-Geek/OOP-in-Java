
import java.util.Scanner;
public class StringReverse
{
	public static void main(String args[])
	{
		String str,rev = "";
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter a string : ");
		str = sc.nextLine();
		int len = str.length();
		for(int i = len-1; i >=0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Entered String : " + str);
		System.out.println("Reverse : " + rev);
	}
}