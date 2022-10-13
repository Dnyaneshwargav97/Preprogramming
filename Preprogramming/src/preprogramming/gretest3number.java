package preprogramming;

import java.util.Scanner;

public class gretest3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st range");
		int num1=sc.nextInt();
		System.out.println("enter the 2nd value");
		int num2=sc.nextInt();
		System.out.println("enter the 3rd value");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("number 1st is greater");
		}
		else if(num2>num3)
		{
			System.out.println("2nd number is greater");
			
		}
		else
		{
			System.out.println("number 3rd is greatest");
		}
	}

}
