package Polymorphism.PolymorphismOverloadingExample;

public class Person {
	private int pid;
	private String name;
	private String city;
	public Person()
	{
		this.pid=100;
		this.name="arun";
		this.city="kalpakkam";
	}
	public Person(int pid,String name)
	{
		this.pid=pid;
		this.name=name;
		this.city="puducherry";
	}
	public Person(int pid,String name,String city)
	{
		this.pid=pid;
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	

}
