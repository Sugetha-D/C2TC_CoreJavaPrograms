package day5.SingleInheritance;

public class Person {
	private int id;
	private String name;
	private String city;
	
	public Person()
	{
		this.id=101;
		this.name="unknown";
		this.city="kalpakkam";
		
	}
	public Person(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public int getId() {
	return id;
	}
	public void setId1(int id)
	{
		this.id=id;
	}
	public String getName() {
		return name;
		}
	public void setId(String name)
		{
			this.name=name;
		}
	public String getCity() {
		return city;
		}
	public void setCity(String city)
		{
			this.city=city;
		}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
