
interface Animal
{
	public void eat();
	public void sleep();
}

interface Pet extends Animal
{
	public void play();
}

class Dog implements Pet
{
	public void eat()
	{
		System.out.println("Animal eats");
	}

	public void sleep()
	{
		System.out.println("Animal sleeps");
	}

	public void play()
	{
		System.out.println("Pet animal plays");
	}
}

public class InterfaceInheritance
{
	public static void main(String args[])
	{
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.eat();
	}
}