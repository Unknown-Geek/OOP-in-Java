
import java.util.*;

public class GarbageCollection
{
	public static void main(String args[])
	{
		Test obj = new Test();
		System.out.println("Before garabage collection.");
		obj.print();
		obj = null;
		System.gc();
		System.out.println("After garbage collection.");
		try
		{
			obj.print();
		}
		catch (Exception e)
		{
			System.out.println("End");
		}
	}
}

class Test
{
	void print()
	{
		System.out.println("This is a test statement");
	}
}