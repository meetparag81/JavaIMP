package JavaIMP.javaIMP;

public final class TestFinalclass 
{
	int a;
	int b;
	TestFinalclass(int c, int d)
	{
		a=c;
		b=d;
		
	}
	TestFinalclass()
	{
		 a = 20;
		b = 30;	
		
	}
	
	public void add1()
	{
		System.out.println(a+b);
		
		
		
	}
	public void add()
	{
	System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		TestFinalclass obj = new TestFinalclass(30, 40);// parameterized constructor is called
		TestFinalclass obj1 = new TestFinalclass();// default constructor is called
		
		obj.add();
		obj1.add1();
		
		
				
	

	}

}
