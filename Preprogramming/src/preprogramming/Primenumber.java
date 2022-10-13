package preprogramming;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		
		int count = 0;
		for(int i=1; i<= num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("the no is prime number");
			
		}
		else
		{
			System.out.println("the no composite number");
		}
		
		
		
				

	}

}
