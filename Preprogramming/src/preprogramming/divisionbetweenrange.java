package preprogramming;

import java.util.Scanner;

import org.openqa.selenium.devtools.v100.systeminfo.SystemInfo;

public class divisionbetweenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the lower range");
		int lower=sc.nextInt();
		System.out.println("enter the higher value");
		int higher=sc.nextInt();
		
		System.out.println("the no. are");
		
		for(int i=lower; i<=higher; i++)
		{
			if(i%3 ==0 && i%5 ==0)
			{
				System.out.println(i);
			}
		}
	}

}
