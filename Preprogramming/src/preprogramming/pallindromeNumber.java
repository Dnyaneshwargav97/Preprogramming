package preprogramming;

import java.util.Scanner;

public class pallindromeNumber {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no.");
		int num=sc.nextInt();
		
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("it is a pallindrome no");
		}
		else
		{
			System.out.println("it is  not a pallindrome no");
		}
		

	}

}
