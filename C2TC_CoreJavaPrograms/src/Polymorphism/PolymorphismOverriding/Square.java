package Polymorphism.PolymorphismOverriding;

public class Square extends Shape {
	public Square(float area)
	{
		super.area=area;
	}
	public void callArea(float area)
	{
		System.out.println("from rectangle class: "+area);
	}
	
	

}
