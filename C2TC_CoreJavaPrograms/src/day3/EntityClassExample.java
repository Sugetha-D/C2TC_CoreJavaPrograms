package day3;

import java.util.Scanner;

class customerDetails{
	  private String name,city;
	  private int id;
	  
  
public void getDetails(String name,String city,int id) {
		this.name=name;
		this.city=city;
		this.id=id;
		
	}
public void display()
	{
		System.out.println(id+" "+ name+" "+city);
	}
  }
	
public class EntityClassExample {
	public static void main(String[] args)
	{
		customerDetails obj=new customerDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your details");
		String name=sc.nextLine();
		String city=sc.nextLine();
		int id=sc.nextInt();
		obj.getDetails(name,city,id);
		obj.display();
	}
	

}
