package day6;

public class StudentDemo {
	public static void main(String args[])
	{
		Student obj=new Student();
		System.out.println(obj);
		Student obj1=new Student();
		System.out.println(obj1);
		Student obj2=new Student();
		System.out.println(obj2);
	}
	//this will not run because JVM executes only the main method with correct signatures.
	public static void main(char c)
	{
		System.out.println("help from main method");
	}
}
