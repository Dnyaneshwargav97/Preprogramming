package preprogramming;

import java.util.Scanner;

public class NoOfcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result=countNo(num);
		System.out.println("the no of digit in number "+result);
		
		
		

	}
public static int countNo(int num)
{
	int temp=num;
	int count=0;
	
	while (num!=0)
	{
		num=num/10;
		count++;
	}
	return count;
}
}
