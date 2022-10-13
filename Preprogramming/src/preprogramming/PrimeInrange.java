package preprogramming;

import java.util.Scanner;

public class PrimeInrange {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower range");
		int num1=sc.nextInt();
		System.out.println("enter the higher range");
		int num2=sc.nextInt();
		
		System.out.println("the prime no in range is ");
		for(int i=num1; i<= num2; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		
		}
	}
	public static boolean isPrime(int num)
	{
		int count=0;
	}

}
