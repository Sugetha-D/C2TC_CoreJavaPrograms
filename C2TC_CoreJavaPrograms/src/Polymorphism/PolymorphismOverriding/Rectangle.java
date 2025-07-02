package Polymorphism.PolymorphismOverriding;

public class Rectangle extends Shape {
	private double l,b;
	public Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	public void callArea(double l,double b)
	{
		System.out.println("from rectangle class: "+(l*b));
	}

}
