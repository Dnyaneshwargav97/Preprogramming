package preprogramming;

import java.util.Scanner;

public class SpecialChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		
		System.out.println("the enter the char is :"+ch);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z'))
		{
			System.out.println("");
		}

	}
}

