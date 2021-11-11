package constructor;

public class B extends A
{
	public B(int c) 
	{
		super();
		//this();
		
		
	}
	
	
	
	
	


	public static void main(String args[])
	{
		new B(10);
		System.out.println("Inside main");
		String s = "kkjl";
		String s1= "kkjl";
		String s2 = "kklj";
		System.out.println(s.equals(s1));
		System.out.println(s.contains(s1));
		System.out.println(s1.contains(s2));
		System.out.println(s.equals(s2));
	}

}
