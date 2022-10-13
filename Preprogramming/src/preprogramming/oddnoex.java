package preprogramming;

import java.util.Scanner;

public class oddnoex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      System.out.println("enter the staarting number: ");
	      int num1=s.nextInt();
	      System.out.println("enter the end number: ");
	      int num2=s.nextInt();
	      
	      
	      int count=0;
	      for(int i=num1;i<=num2; i++)
	      {
	    	  if(i%2 !=0)
	    	  {
	    		  System.out.println(i);
	    		  count++;
	    	  }
	      }
          System.out.println("the count value is "+count);
	}




	}


