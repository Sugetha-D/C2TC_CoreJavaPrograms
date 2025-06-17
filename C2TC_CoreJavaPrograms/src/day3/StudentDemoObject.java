package day3;

class StudentDemoObject {
	private String name;
	private int id;
	private int age;
	StudentDemoObject()
	{
		System.out.println("i am a default constructor");
	}
	
	StudentDemoObject(int age)
	{
		System.out.println("age= "+age);
	}
	StudentDemoObject(String name){
		System.out.println("name= "+name);
	}
	
	StudentDemoObject(String name,int id)
	{
		System.out.println("name= "+name+ "\nid= "+id);
	}

	
}

