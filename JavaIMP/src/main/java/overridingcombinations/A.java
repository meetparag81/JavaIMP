package overridingcombinations;

public class A
{
	int a= 10;
	int b=20;
	public void Add()
	{
		
	}
	
	private void Sub()
	{
		
	}
	
	public int div(int a, int b)
	{
		return a*b;
	
	}
	
	public int div(int a, Integer b)
	{
		return a+b;
	
	}
	
	public int multi(int a, int b)
	{
		return a*b;
	
	}

}
