package ExceptionHandling;

public class ThrowsTest {

	public static void main(String[] args) 
	{
		int a;
		try
		{
		a = 50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is seen");
		}
		System.out.println("Nextline");

	}

}
