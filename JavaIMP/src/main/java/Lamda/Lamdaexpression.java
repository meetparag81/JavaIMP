package Lamda;

public class Lamdaexpression 
{
	public int square(int n)// this is by normal way
	{
		return n*n;
		
	}
	
	

	public static void main(String[] args) 
	{
		MathOperation addition = ( a, b) -> a + b;
		 MathOperation subtraction = (a, b) -> a - b;
		 MathOperation multiplication = (a,b)->a*b;
		 MathOperation	division = (a,b)->a/b;
		Lamdaexpression tester = new Lamdaexpression();
		 System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		 
	    

	}



	



	private int operate(int a, int b, MathOperation mathOperation) 
	{
	      return mathOperation.operation(a, b);
	   }


	



	
		
	}


