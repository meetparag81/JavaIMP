package AcessModifier;

import AcessModifier1.App;

public class A extends B
{

	public static void main(String[] args) 
	{
		A obj = new A();
		
		int b= obj.a;
		System.out.println("Protected variable value is"+ b);
	}

}
