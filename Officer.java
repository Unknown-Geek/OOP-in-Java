
import java.util.Scanner;

public class Officer extends Employee
{
	String dept, spec;
	Officer(String name, int age, int ph, String address, float salary,String dept, String spec)
	{
		super(name,age,ph,address,salary);
		this.dept = dept;
		this.spec = spec;
	}

	public void get_details(Officer officer)
	{
		System.out.println("DETAILS\n");
		System.out.println("name : " + name);
		System.out.println("age : "+age);
		System.out.println("phone No : "+ph);
		System.out.println("address : "+address);
		officer.printSalary();
		System.out.println("Department : "+dept);
		System.out.println("specialization : "+spec);
	}

	public static void main(String args[])
	{
		String name;
		int age, ph;
		String address;
		float salary;
		String dept,spec;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextInt();
		System.out.print("Enter phone no : ");
		ph = sc.nextInt();
		System.out.print("Enter salary : ");
		salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter Address : ");
		address = sc.nextLine();
		System.out.print("Enter Department : ");
		dept = sc.nextLine();
		System.out.print("Enter specialization : ");
		spec = sc.nextLine();
		Officer officer = new Officer(name,age,ph,address,salary,dept,spec);

		officer.get_details(officer);

	}
}