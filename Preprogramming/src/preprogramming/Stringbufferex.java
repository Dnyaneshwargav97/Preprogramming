package preprogramming;

public class Stringbufferex {

	public static void main(String[] args)
	{
		StringBuffer s= new StringBuffer("hello hi");
		StringBuffer s1= new StringBuffer("hello hi");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode()==s1.hashCode());
		

	}

}
