package preprogramming;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sum=1;
		int temp= num;
		
		for(int i=2; i<= num/2; i++)
		{
			if(temp% i ==0)
			{
				sum=sum+i;
			}
		}
        if(sum == num)
        {     
        	System.out.println("number is perfect no.");
	
        }
        else
        {
        	System.out.println("the is not perfect number");
        }
	}

}
