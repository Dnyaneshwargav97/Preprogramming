package preprogramming;

import java.util.Scanner;

public class ReversalOfString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];//shifting the element from nth index
			ch[ch.length-1-i]=t;//swapping the string
		}
		st=new String(ch);
		System.out.println("the reversal of string is "+st);
	
	}

}
