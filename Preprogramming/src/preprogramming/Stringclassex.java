package preprogramming;

public class Stringclassex {

	public static void main(String[] args) 
	{
		String s1;
		s1="Hello";//string 1
		String s2;
		s2=new String("Hello"); //String 2
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//camparing the reference
		System.out.println(s1.hashCode());//integer value of string
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));//camparing the attributes 
		

	}

}
