package Constructors;

public class B extends A 
{
	
	public B(String name)
    {
        System.out.println("Child class Parameterized constructor called by "+name);
    }

	public B() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		A obj1 = new A( "JIP");
		B obj2 = new B("jip");
		
		

	}

}
