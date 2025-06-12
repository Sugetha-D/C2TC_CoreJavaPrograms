package day1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a");
		a=in.nextInt();
		System.out.println("enter b");
		b=in.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b +" is "+ c);

	}

}
