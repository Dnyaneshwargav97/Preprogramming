package preprogramming;

import java.util.Scanner;

public class Firstdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result = firstNo(num);
		System.out.println("first digit number is :"+result);
		
	}
	
	public static int firstNo(int num)
	{
		int temp=num;
		while(temp>=10)
		{
			temp=temp/10;
		}
		return temp;
	}

}
