package preprogramming;

import java.util.Scanner;

public class sumofrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the lower range");
		int lower=sc.nextInt();
		System.out.println("enter the higher value");
		int higher=sc.nextInt();
		
		int sum=0;
		
		for(int i=lower; i<=higher; i++)
		{
			sum=i++;
			System.out.println(i);
		} 
		//System.out.println(sum);

	}

}