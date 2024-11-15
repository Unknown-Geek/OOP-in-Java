
abstract class Shape
{
	public void numberofSides(){}
}

class Rectangle extends Shape
{
	int sides = 4;
	public void numberofSides(){
		System.out.println ("Number of sides of rectangle : "+sides);
	}
}

class Triangle extends Shape
{
	int sides = 3;
	public void numberofSides(){
		System.out.println ("Number of sides of triangle : "+sides);
	}
}

class Hexagon extends Shape
{
	int sides = 6;
	public void numberofSides(){
		System.out.println ("Number of sides of hexagon : "+sides);
	}
}

public class ShapeExample
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.numberofSides();
		Triangle t = new Triangle();
		t.numberofSides();
		Hexagon h = new Hexagon();
		h.numberofSides();
	}
}