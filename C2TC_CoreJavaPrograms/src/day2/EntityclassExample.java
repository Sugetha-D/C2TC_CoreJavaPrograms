package day2;
class StudentDetails{
	private int id;
	private String name;
	private int age;
	
	public void getId(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void setId()
	{
		System.out.println("id="+ id +", name="+ name  +", age="+ age);
	}
	
}

public class EntityclassExample {
	public static void main(String[] args)
	{
		StudentDetails obj=new StudentDetails();
		obj.getId(101,"sugetha",20);
		obj.setId();
		obj.getId(102,"isha",21);
		obj.setId();
		
		
				
	}

}
