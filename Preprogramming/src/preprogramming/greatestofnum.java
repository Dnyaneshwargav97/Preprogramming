package preprogramming;

import java.util.Scanner;

public class greatestofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st range");
		int num1=sc.nextInt();
		System.out.println("enter the 2nd value");
		int num2=sc.nextInt();
		System.out.println("enter the 3rd value");
		int num3=sc.nextInt();
		
		System.out.println("the greatet no is "+largestNumber(num1,num2,num3));

	}
	public static int largestNumber(int num1,int num2, int num3)
	{
		int temp=num1>num2? num1:num2;
		int res=num3>temp? num3:temp;
		return res;
	}

}
