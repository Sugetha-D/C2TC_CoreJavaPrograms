package Polymorphism.PolymorphismOverloadingExample;

public class Executor {
	public static void main(String args[])
	{
		System.out.println("1.addition: "+OverloadingExample.addition("hello", " world"));
		System.out.println("2.addition: "+OverloadingExample.addition(5, 6));
		System.out.println("3.addition: "+OverloadingExample.addition(4.08f, 5.0f));
		System.out.println("4.addition: "+OverloadingExample.addition(4, 8.0f));
		System.out.println("5.addition: "+OverloadingExample.addition(7.5f, 9));
		
		Person p1=new Person();
		System.out.println(p1);
		p1=new Person(101,"hema");
		System.out.println(p1);
		p1=new Person(102,"aasha","banglore");
		System.out.println(p1);
		
		
		
	}

}
