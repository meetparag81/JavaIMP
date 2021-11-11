package Lamda;

public interface Demo 
{
	public void m1();
	

}
class Democlass implements Demo
{

	@Override
	public void m1() 
	{
		System.out.println("Implements the Inter method "+"m1()" );
		
		
	}

}
class Test
{
	public static void main(String args[])
	{
		/*Inter i = new Demo();
		i.m1();*/ // this is by normal way 
		
		
		
		//by using lamda expression
		 
		// int i = ()-> System.out.println("Implements the Inter method "+"m1()" );// provide implementation which we have implemented in Demo class
		
		//i.m1();// to call the method we use interface refrence variable and called it in the test class
		
		
	}
	
	
}
