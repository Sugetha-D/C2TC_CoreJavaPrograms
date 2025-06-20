package day6;

public class Student {
private String name;
private final static int x;//just declaring
private static int id;
private int reg;
static {
	x=10;
}

public Student()
{ 
	//this.x=x;
	id++;
	reg++;
	System.out.println("constructor called");
}
public int getReg()
{
	return reg;
}
public void setReg(int reg)
{
	this.reg=reg;
}

public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public static int getId() {
	return id;
}
public static void setId(int id) {
	Student.id = id;
}
public String toString()
{
	return "Student [ name= "+name+" id="+id+"  reg= "+reg+" ]";
}
}
