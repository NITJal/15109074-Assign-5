abstract class Shape
{
	int sides;
	Shape(int s)
	{
	    sides=s;
	}
	abstract void numberOfSides();
}
class Triangle extends Shape
{
	Triangle(int s)
	{
		super(s);
	}
	void numberOfSides()
	{
		System.out.println("Number of sides in Triangle="+sides);
	}
}
class Trapezoid extends Shape
{
	Trapezoid(int s)
	{
		super(s);
	}
	void numberOfSides()
	{
		System.out.println("Number of sides in Trapezoid="+sides);
	}
}
class Hexagon extends Shape
{
	Hexagon(int s)
	{
		super(s);
	}
	void numberOfSides()
	{
		System.out.println("Number of sides in Hexagon="+sides);
	}
}
public class ShapeTest {
	public static void main(String args[])
	{
		Shape sh;
		Triangle tr=new Triangle(3);
		Trapezoid td=new Trapezoid(4);
		Hexagon hx=new Hexagon(6);
		sh=tr;
		sh.numberOfSides();
		sh=td;
		sh.numberOfSides();
		sh=hx;
		sh.numberOfSides();
	}
}