package preprogramming;

import java.util.Scanner;

public class swappingwithout {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("enter the value of b: ");
		int b=sc.nextInt();
		
		System.out.println("the value of a is :"+a);
		System.out.println("the value of b is : "+b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("the value of a is :"+a);
		System.out.println("the value of b is :"+b);
				
		


	}

}
