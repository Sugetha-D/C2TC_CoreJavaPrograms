package day2;

 class Details{
          int id;
          String name;
          int age;
 
          
void show()
{
	System.out.println("id is "+id+"\nname is "+ name +" \nage is "+age);
}
 }
public class Student {
public static void main(String[] args)
{
	
	Details obj=new Details();
	obj.id=101;
	obj.name="sugetha";
	obj.age=20;
	obj.show();
	
	
}
}

