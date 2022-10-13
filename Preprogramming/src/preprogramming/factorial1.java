package preprogramming;

import java.util.Scanner;

public class factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no.");
		int num=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			int pro=num*i;
			System.out.println(num+"*"+i+"="+pro);
		}
		

	}

}
