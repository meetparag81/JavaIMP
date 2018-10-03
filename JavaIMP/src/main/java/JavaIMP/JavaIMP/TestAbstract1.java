package JavaIMP.JavaIMP;

public class TestAbstract1 
{
	TestAbstract1()
	{
		a = 30;
		b = 10;		
	}
	static int a = 10;
	static int b = 20;
	
	public static int  add(int a, int b)
	{
		return a+b;
		
	}
	public static int  add()
	{
		return a+b;
		
	}

	public static void main(String[] args) 
	{
		TestAbstract1 obj = new TestAbstract1();
		System.out.println(TestAbstract1.add(5, 1));
		System.out.println(TestAbstract1.add());
		

	}

}
