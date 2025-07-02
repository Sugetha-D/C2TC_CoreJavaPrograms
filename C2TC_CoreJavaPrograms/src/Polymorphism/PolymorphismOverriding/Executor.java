package Polymorphism.PolymorphismOverriding;

public class Executor {
	public static void main(String args[])
	{
		Shape s1=new Shape();
		s1.callArea();
		Square s2=new Square(32f);
		s2.callArea();
		Rectangle s3=new Rectangle(3.5,4);
		s3.callArea();
	}

}
