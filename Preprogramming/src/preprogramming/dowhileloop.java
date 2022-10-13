package preprogramming;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		System.out.println("eter the frist value");
		int num1=sc.nextInt();
		System.out.println("enter the 2nd value");
		int num2=sc.nextInt();
		
		int sum=0;
		do
		{
		    sum=sum+num1;
		    num1++;
		}
		while(num1<=num2);
		System.out.println("the sum is "+ sum );
	}

}
