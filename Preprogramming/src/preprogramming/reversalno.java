package preprogramming;

import java.util.Scanner;

public class reversalno {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 
		Scanner s=new Scanner(System.in);
	      System.out.println("enter the number: ");
	      int num=s.nextInt();
	      
	      System.out.println("***********************");
	      
	      while (num!=0)
	      {
	    	  System.out.println(num%10);
	    	  num=num/10;
	      }

	}
}
