package Inner;

import child.B;

public class InnerDemo 
{
	public static void main(String[] args)
	{
		B obj =new B();
	}
	
	class A
	{
		int rollno;
		String name;
		class B
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}
		
	}

	

}
