
import java.util.Scanner;
public class AreaCalculator
{
	public static void area(float r)
	{
		double area = 3.14 * r * r;
		System.out.println("Area : " + area);
	}

	public static void area(float l, float b)
	{
		double area = l * b;
		System.out.println("Area : " + area);
	}

	public static void area(double b, double h)
	{
		double area = 0.5 * b * h;
		System.out.println("Area : "+area);	
	}

	public static void main(String args [])
	{
		int ch;
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		while(running)
		{
			System.out.println();
			System.out.println("1. Area of Circle");
			System.out.println("2. Area of Rectangle");
			System.out.println("3. Area of Triangle");
			System.out.println("4. Exit");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			System.out.println();
			switch(ch)
			{

			case 1:
				float r;
				System.out.print("Enter radius of circle : ");
				r= sc.nextFloat();
				area(r);
				break;

			case 2:
				float l,b;
				System.out.print("Enter length of rectangle : ");
				l = sc.nextFloat();
				System.out.print("Enter breadth of rectangle : ");
				b = sc.nextFloat();
				area(l,b);
				break;

			case 3:
				double br,h;
				System.out.print("Enter base of triangle: ");
				br = sc.nextDouble();
				System.out.print("Enter height of triangle : ");
				h = sc.nextDouble();
				area(br,h);
				break;	

			case 4:
				running = false;
				break;

			default :
				System.out.println("Invalid Choice.");
			}
			if (ch == 4)
				break;
		}

	}
}