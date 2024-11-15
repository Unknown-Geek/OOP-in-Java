
import java.util.Scanner;
public class Employee
{
	String name;
	int age, ph;
	String address;
    float salary;

	public Employee(String name, int age, int ph, String address, float salary)
	{
		this.name = name;
		this.age = age;
		this.ph = ph;
		this.address = address;
		this.salary = salary;
			
	}

	public void display()
	{
		System.out.println("\nEMPLOYEE DETAILS\n");
		System.out.println("name : " + name);
		System.out.println("age : "+age);
		System.out.println("phone No : "+ph);
		System.out.println("address : "+address);
	}

	public void printSalary()
	{
		System.out.println("Salary : "+ salary);
	}
}